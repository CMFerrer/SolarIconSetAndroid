package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.videoaudiosound.Album
import dev.chiksmedina.solar.broken.videoaudiosound.Camera
import dev.chiksmedina.solar.broken.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.broken.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.broken.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.broken.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.broken.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.broken.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.broken.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.broken.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.broken.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.broken.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.broken.videoaudiosound.FullScreen
import dev.chiksmedina.solar.broken.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.broken.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.broken.videoaudiosound.Gallery
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.broken.videoaudiosound.GallerySend
import dev.chiksmedina.solar.broken.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.broken.videoaudiosound.Library
import dev.chiksmedina.solar.broken.videoaudiosound.Microphone
import dev.chiksmedina.solar.broken.videoaudiosound.Microphone2
import dev.chiksmedina.solar.broken.videoaudiosound.Microphone3
import dev.chiksmedina.solar.broken.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.broken.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.broken.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNote
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.broken.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.broken.videoaudiosound.Muted
import dev.chiksmedina.solar.broken.videoaudiosound.Panorama
import dev.chiksmedina.solar.broken.videoaudiosound.Pause
import dev.chiksmedina.solar.broken.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.broken.videoaudiosound.Pip
import dev.chiksmedina.solar.broken.videoaudiosound.Pip2
import dev.chiksmedina.solar.broken.videoaudiosound.Play
import dev.chiksmedina.solar.broken.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.broken.videoaudiosound.PlayStream
import dev.chiksmedina.solar.broken.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.broken.videoaudiosound.Podcast
import dev.chiksmedina.solar.broken.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.broken.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.broken.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.broken.videoaudiosound.QuitPip
import dev.chiksmedina.solar.broken.videoaudiosound.Record
import dev.chiksmedina.solar.broken.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.broken.videoaudiosound.Reel
import dev.chiksmedina.solar.broken.videoaudiosound.Reel2
import dev.chiksmedina.solar.broken.videoaudiosound.Repeat
import dev.chiksmedina.solar.broken.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.broken.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.broken.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.broken.videoaudiosound.RewindBack
import dev.chiksmedina.solar.broken.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.broken.videoaudiosound.RewindForward
import dev.chiksmedina.solar.broken.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.broken.videoaudiosound.Shuffle
import dev.chiksmedina.solar.broken.videoaudiosound.SkipNext
import dev.chiksmedina.solar.broken.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.broken.videoaudiosound.Soundwave
import dev.chiksmedina.solar.broken.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.broken.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.broken.videoaudiosound.Stop
import dev.chiksmedina.solar.broken.videoaudiosound.StopCircle
import dev.chiksmedina.solar.broken.videoaudiosound.Stream
import dev.chiksmedina.solar.broken.videoaudiosound.ToPip
import dev.chiksmedina.solar.broken.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.broken.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.broken.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.broken.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.broken.videoaudiosound.Videocamera
import dev.chiksmedina.solar.broken.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.broken.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.broken.videoaudiosound.Vinyl
import dev.chiksmedina.solar.broken.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.broken.videoaudiosound.Volume
import dev.chiksmedina.solar.broken.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.broken.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.broken.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.broken.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val BrokenSolar.VideoAudioSound: VideoAudioSoundGroup
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
