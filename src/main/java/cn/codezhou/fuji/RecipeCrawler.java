package cn.codezhou.fuji;

import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.URL;
import java.util.*;

public class RecipeCrawler {

    private static final String DOWNLOAD_URL = "https://fxwapp.s3.amazonaws.com/FXW+App+Recipes.xlsx";
    private static final String DOWNLOAD_FILE = "recipes.xlsx";
    private static final String FINAL_FILE = "recipes.json";

    public static void main(String[] args) throws IOException {
        RecipeCrawler crawler = new RecipeCrawler();
        crawler.download();
        crawler.generate();
    }

    /**
     * 下载数据
     *
     * @throws IOException
     */
    public void download() throws IOException {
        URL url = new URL(DOWNLOAD_URL);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(DOWNLOAD_FILE);
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, len);
        }
        fis.close();
        bis.close();
    }

    /**
     * 解析数据
     *
     * @throws IOException
     */
    public void generate() throws IOException {
        Workbook workbook = new XSSFWorkbook(new FileInputStream(DOWNLOAD_FILE));
        Sheet sheet = workbook.getSheetAt(0);
        List<Recipe> list = new ArrayList<>();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Recipe recipe = new Recipe();
            if (getCellVal(row, 0).equals("")) {
                continue;
            }
            recipe.setId(i - 1);
            recipe.setRecipe(getCellVal(row, 0));
            recipe.setSensor(getCellVal(row, 1));
            String cameras = getCellVal(row, 2).replace(" ", "");
            recipe.setCameras(Arrays.asList(cameras.split(",")));
            recipe.setRecipeId(getCellVal(row, 3));
            recipe.setDate(getCellVal(row, 4));
            recipe.setRecipeType(getCellVal(row, 5));
            recipe.setSubscription(getCellVal(row, 6));
            recipe.setSimulation(getCellVal(row, 7));
            recipe.setDynamicRange(getCellVal(row, 8));
            recipe.setHighlight(getCellVal(row, 9));
            recipe.setShadow(getCellVal(row, 10));
            recipe.setColor(getCellVal(row, 11));
            recipe.setNoiseReduction(getCellVal(row, 12));
            recipe.setSharpening(getCellVal(row, 13));
            recipe.setClarity(getCellVal(row, 14));
            recipe.setToning(getCellVal(row, 15));
            recipe.setGrainEffect(getCellVal(row, 16));
            recipe.setColorChromeEffect(getCellVal(row, 17));
            recipe.setColorChromeEffectBlue(getCellVal(row, 18));
            recipe.setWhiteBalance(getCellVal(row, 19));
            recipe.setWBShiftRed(getCellVal(row, 20));
            recipe.setWBShiftBlue(getCellVal(row, 21));
            recipe.setIos(getCellVal(row, 22));
            recipe.setExposureCompensation(getCellVal(row, 23));
            recipe.setRecipeWebsite(getCellVal(row, 24));
            recipe.setFeaturePicture(getCellVal(row, 25));
            String photos = getCellVal(row, 26).replace(" ", "");
            recipe.setPhotographs(Arrays.asList(photos.split(",")));
            recipe.setHashtagName(getCellVal(row, 27));
            recipe.setHashtagAddress(getCellVal(row, 28));
            list.add(recipe);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("total", list.size());
        map.put("data", list);
        FileWriter writer = new FileWriter(FINAL_FILE);
        writer.write(new Gson().toJson(map));
        writer.flush();
    }

    private String getCellVal(Row row, int idx) {
        Cell cell = row.getCell(idx);
        if (cell == null) {
            return "";
        }
        if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        }
        return cell.getStringCellValue();
    }
}
