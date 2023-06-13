package cn.codezhou.fuji;

import java.util.List;

public class Recipe {

    private int id;

    private String recipe;
    private String sensor;
    private List<String> cameras;
    private String recipeId;
    private String date;
    // colorOrB&W
    private String recipeType;
    // 是否订阅解锁
    private String subscription;
    // 胶片模拟
    private String simulation;
    // 动态范围
    private String dynamicRange;
    // 高光色调
    private String highlight;
    // 阴影色调
    private String shadow;
    // 色彩
    private String color;
    // 高IOS降噪
    private String noiseReduction;
    // 锐度
    private String sharpening;
    // 清晰度
    private String clarity;

    private String toning;
    // 颗粒效果
    private String grainEffect;
    // 色彩效果
    private String colorChromeEffect;
    // 彩色XF蓝色
    private String ColorChromeEffectBlue;
    // 白平衡
    private String WhiteBalance;
    private String WBShiftRed;
    private String WBShiftBlue;
    // 感光度
    private String ios;
    // 曝光补偿
    private String exposureCompensation;

    private String recipeWebsite;

    private String featurePicture;

    private List<String> photographs;

    private String hashtagName;
    private String hashtagAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public List<String> getCameras() {
        return cameras;
    }

    public void setCameras(List<String> cameras) {
        this.cameras = cameras;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getSimulation() {
        return simulation;
    }

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    public String getDynamicRange() {
        return dynamicRange;
    }

    public void setDynamicRange(String dynamicRange) {
        this.dynamicRange = dynamicRange;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getShadow() {
        return shadow;
    }

    public void setShadow(String shadow) {
        this.shadow = shadow;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNoiseReduction() {
        return noiseReduction;
    }

    public void setNoiseReduction(String noiseReduction) {
        this.noiseReduction = noiseReduction;
    }

    public String getSharpening() {
        return sharpening;
    }

    public void setSharpening(String sharpening) {
        this.sharpening = sharpening;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getToning() {
        return toning;
    }

    public void setToning(String toning) {
        this.toning = toning;
    }

    public String getGrainEffect() {
        return grainEffect;
    }

    public void setGrainEffect(String grainEffect) {
        this.grainEffect = grainEffect;
    }

    public String getColorChromeEffect() {
        return colorChromeEffect;
    }

    public void setColorChromeEffect(String colorChromeEffect) {
        this.colorChromeEffect = colorChromeEffect;
    }

    public String getColorChromeEffectBlue() {
        return ColorChromeEffectBlue;
    }

    public void setColorChromeEffectBlue(String colorChromeEffectBlue) {
        ColorChromeEffectBlue = colorChromeEffectBlue;
    }

    public String getWhiteBalance() {
        return WhiteBalance;
    }

    public void setWhiteBalance(String whiteBalance) {
        WhiteBalance = whiteBalance;
    }

    public String getWBShiftRed() {
        return WBShiftRed;
    }

    public void setWBShiftRed(String WBShiftRed) {
        this.WBShiftRed = WBShiftRed;
    }

    public String getWBShiftBlue() {
        return WBShiftBlue;
    }

    public void setWBShiftBlue(String WBShiftBlue) {
        this.WBShiftBlue = WBShiftBlue;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getExposureCompensation() {
        return exposureCompensation;
    }

    public void setExposureCompensation(String exposureCompensation) {
        this.exposureCompensation = exposureCompensation;
    }

    public String getRecipeWebsite() {
        return recipeWebsite;
    }

    public void setRecipeWebsite(String recipeWebsite) {
        this.recipeWebsite = recipeWebsite;
    }

    public String getFeaturePicture() {
        return featurePicture;
    }

    public void setFeaturePicture(String featurePicture) {
        this.featurePicture = featurePicture;
    }

    public List<String> getPhotographs() {
        return photographs;
    }

    public void setPhotographs(List<String> photographs) {
        this.photographs = photographs;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public void setHashtagName(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public String getHashtagAddress() {
        return hashtagAddress;
    }

    public void setHashtagAddress(String hashtagAddress) {
        this.hashtagAddress = hashtagAddress;
    }
}
