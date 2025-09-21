package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Album
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Camera
import dev.chiksmedina.solar.boldduotone.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.boldduotone.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.boldduotone.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.boldduotone.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.boldduotone.videoaudiosound.FullScreen
import dev.chiksmedina.solar.boldduotone.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Gallery
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GallerySend
import dev.chiksmedina.solar.boldduotone.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Library
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Microphone
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Microphone2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Microphone3
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Muted
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Panorama
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Pause
import dev.chiksmedina.solar.boldduotone.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Pip
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Pip2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Play
import dev.chiksmedina.solar.boldduotone.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.PlayStream
import dev.chiksmedina.solar.boldduotone.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Podcast
import dev.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.boldduotone.videoaudiosound.QuitPip
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Record
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Reel
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Reel2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Repeat
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RewindBack
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RewindForward
import dev.chiksmedina.solar.boldduotone.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Shuffle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.SkipNext
import dev.chiksmedina.solar.boldduotone.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Soundwave
import dev.chiksmedina.solar.boldduotone.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Stop
import dev.chiksmedina.solar.boldduotone.videoaudiosound.StopCircle
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Stream
import dev.chiksmedina.solar.boldduotone.videoaudiosound.ToPip
import dev.chiksmedina.solar.boldduotone.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.boldduotone.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Videocamera
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Vinyl
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Volume
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.boldduotone.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.boldduotone.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val BoldDuotoneSolar.VideoAudioSound: VideoAudioSoundGroup
    get() = VideoAudioSoundGroup

private var _AllIcons: KtList<ImageVector>? = null

val VideoAudioSoundGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Album,
            Camera,
            CameraAdd,
            CameraMinimalistic,
            CameraRotate,
            CameraSquare,
            Clapperboard,
            ClapperboardEdit,
            ClapperboardOpen,
            ClapperboardOpenPlay,
            ClapperboardPlay,
            ClapperboardText,
            FullScreen,
            FullScreenCircle,
            FullScreenSquare,
            Gallery,
            GalleryAdd,
            GalleryCheck,
            GalleryCircle,
            GalleryDownload,
            GalleryEdit,
            GalleryFavourite,
            GalleryMinimalistic,
            GalleryRemove,
            GalleryRound,
            GallerySend,
            GalleryWide,
            Library,
            Microphone,
            Microphone2,
            Microphone3,
            MicrophoneLarge,
            MusicLibrary,
            MusicLibrary2,
            MusicNote,
            MusicNotes,
            MusicNote2,
            MusicNote3,
            MusicNote4,
            MusicNoteSlider,
            MusicNoteSlider2,
            Muted,
            Panorama,
            Pause,
            PauseCircle,
            Pip,
            Pip2,
            Play,
            PlaybackSpeed,
            PlayCircle,
            PlayStream,
            Podcast,
            QuitFullScreen,
            QuitFullScreenCircle,
            QuitFullScreenSquare,
            QuitPip,
            Record,
            RecordCircle,
            Reel,
            Reel2,
            Repeat,
            RepeatOne,
            RepeatOneMinimalistic,
            Rewind10SecondsBack,
            Rewind10SecondsForward,
            Rewind15SecondsBack,
            Rewind15SecondsForward,
            Rewind5SecondsBack,
            Rewind5SecondsForward,
            RewindBack,
            RewindBackCircle,
            RewindForward,
            RewindForwardCircle,
            Shuffle,
            SkipNext,
            SkipPrevious,
            Soundwave,
            SoundwaveCircle,
            SoundwaveSquare,
            Stop,
            StopCircle,
            Stream,
            ToPip,
            UploadTrack,
            UploadTrack2,
            Videocamera,
            VideocameraAdd,
            VideocameraRecord,
            VideoFrame,
            VideoFrame2,
            VideoFrameCut,
            VideoFrameCut2,
            VideoFramePlayHorizontal,
            VideoFramePlayVertical,
            VideoFrameReplace,
            VideoLibrary,
            Vinyl,
            VinylRecord,
            Volume,
            VolumeCross,
            VolumeLoud,
            VolumeSmall,
            Wallpaper
        )
        return _AllIcons!!
    }
