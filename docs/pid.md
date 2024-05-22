# Project Initiation Document - Wiziplicity
## Preamble
To start off I'd like to make it clear this will not be a perfect document, I, the sole developer, am the one who is planning and creating this project to suit my needs.
It will therefore be missing aspects that will otherwise be included such as a budget for the project, though a time budget for the minimum viable product as well as phases for polish and extra features will be established.

This document will also be written from my perspective, whilst I can write it more formally I believe there is no benefit to me doing so.

Let's start with setting the scene to give people who are completely unaware of Minecraft and surrounding projects a basic understanding so that they too can navigate this document and be informed.

- **Minecraft**: A very popular block based sandbox game where you can create almost anything your heart desires.
- **Essentials**: A plugin for various modded Minecraft server frameworks including Paper, Spigot, and CraftBukkit. It provides many features but most notably to us, it provides a way for players to set a nickname using its own custom nickname format.
- **Styled Chat**: A mod for the Fabric mod loader, like Essentials it allows users to set custom nicknames but in a format different to Essentials.
- **Paper** / **Spigot** / **CraftBukkit**: These are solutions for server side minecraft mods, at their core they provide the same API that wraps over commonly used Minecraft hooks, for example: detecting and modifying messages players send in chat.
- **Fabric**: Fabric consists of 2 major parts: the mod loader and the modding API. Both usually work in tandem to allow mod developers to write mods that work on the client and or the server and can modify the game however they wish.

### Plurality
This mod is being made with pluralfolk in mind if this concept is entirely new to you please check out some amazing external resources, and I'll try to do my best to provide a basic, limited definition to get through this document.

#### External resources (prefer these)
- [More than one](https://morethanone.info/)
- [Plurality Hub](https://plurality-hub.carrd.co/)
- [Plurality - Moderation Wiki](https://moderation.wiki/a/plurality)

#### Basic Definitions
- **Pluralfolk** / **Plural System**: A simple way to refer to bodies occupied by multiple self-aware beings.
- **Plurality**: The existence of multiple self-aware beings in one body.
- **Disassociation**: A disconnect between an individual's sense of self, memories, feelings, thoughts, and behaviour.
- **Headmate**: An individual that exists within a plural system.
- **Fronting**: When a certain individual within a system has control of the body.

## Project Definition

### Project Purpose
To put it bluntly, I disassociate mostly in terms of sense of self, this means sometimes I can be presenting as a boy named Quill and other times I can be presenting as a girl named Quinn. These are just two examples of headmates that exist in our system, it's quite complex and ever-changing.

As is probably quite obviously when Quill is fronting he would like for others to see him as Quill, as himself. Minecraft accounts have account names which can be changed every 30 days however this is quite inadequate for pluralfolk like us who can switch for short periods of time in comparison. This is where Minecraft mods and plugins come into play, Styled Chat and Essentials both allow users to have nicknames which otherwise would conflict with other user's usernames and can be changed much more frequently, usually every 5 minutes, however these nicknames are per Minecraft server.

Whilst existing products exist in this sector e.g. [Switchy](https://modrinth.com/mod/switchy), they rely on a server side component for Fabric / NeoForge which most server owners would likely be unwilling or unable to add, additionally it only supports Styled Chat which would not support my use case of also needing it on a Paper server with the Essentials plugin.
