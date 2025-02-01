class Dialog extends Container {
    private String wikiPageURL;

    public void setWikiPageURL(String wikiPageURL) {
        this.wikiPageURL = wikiPageURL;
    }

    @Override
    public void showHelp() {
        if (wikiPageURL != null && !wikiPageURL.isEmpty()) {
            System.out.println("Opening wiki page: " + wikiPageURL);
        } else {
            super.showHelp();
        }
    }
}