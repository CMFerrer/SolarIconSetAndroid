package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.videoaudiosound.Album
import dev.chiksmedina.solar.outline.videoaudiosound.Camera
import dev.chiksmedina.solar.outline.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.outline.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.outline.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.outline.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.outline.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.outline.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.outline.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.outline.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.outline.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.outline.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.outline.videoaudiosound.FullScreen
import dev.chiksmedina.solar.outline.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.outline.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.outline.videoaudiosound.Gallery
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.outline.videoaudiosound.GallerySend
import dev.chiksmedina.solar.outline.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.outline.videoaudiosound.Library
import dev.chiksmedina.solar.outline.videoaudiosound.Microphone
import dev.chiksmedina.solar.outline.videoaudiosound.Microphone2
import dev.chiksmedina.solar.outline.videoaudiosound.Microphone3
import dev.chiksmedina.solar.outline.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.outline.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.outline.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNote
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.outline.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.outline.videoaudiosound.Muted
import dev.chiksmedina.solar.outline.videoaudiosound.Panorama
import dev.chiksmedina.solar.outline.videoaudiosound.Pause
import dev.chiksmedina.solar.outline.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.outline.videoaudiosound.Pip
import dev.chiksmedina.solar.outline.videoaudiosound.Pip2
import dev.chiksmedina.solar.outline.videoaudiosound.Play
import dev.chiksmedina.solar.outline.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.outline.videoaudiosound.PlayStream
import dev.chiksmedina.solar.outline.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.outline.videoaudiosound.Podcast
import dev.chiksmedina.solar.outline.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.outline.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.outline.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.outline.videoaudiosound.QuitPip
import dev.chiksmedina.solar.outline.videoaudiosound.Record
import dev.chiksmedina.solar.outline.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.outline.videoaudiosound.Reel
import dev.chiksmedina.solar.outline.videoaudiosound.Reel2
import dev.chiksmedina.solar.outline.videoaudiosound.Repeat
import dev.chiksmedina.solar.outline.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.outline.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.outline.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.outline.videoaudiosound.RewindBack
import dev.chiksmedina.solar.outline.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.outline.videoaudiosound.RewindForward
import dev.chiksmedina.solar.outline.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.outline.videoaudiosound.Shuffle
import dev.chiksmedina.solar.outline.videoaudiosound.SkipNext
import dev.chiksmedina.solar.outline.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.outline.videoaudiosound.Soundwave
import dev.chiksmedina.solar.outline.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.outline.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.outline.videoaudiosound.Stop
import dev.chiksmedina.solar.outline.videoaudiosound.StopCircle
import dev.chiksmedina.solar.outline.videoaudiosound.Stream
import dev.chiksmedina.solar.outline.videoaudiosound.ToPip
import dev.chiksmedina.solar.outline.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.outline.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.outline.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.outline.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.outline.videoaudiosound.Videocamera
import dev.chiksmedina.solar.outline.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.outline.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.outline.videoaudiosound.Vinyl
import dev.chiksmedina.solar.outline.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.outline.videoaudiosound.Volume
import dev.chiksmedina.solar.outline.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.outline.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.outline.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.outline.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val OutlineSolar.VideoAudioSound: VideoAudioSoundGroup
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
