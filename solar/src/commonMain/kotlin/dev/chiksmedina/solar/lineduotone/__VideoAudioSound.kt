package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Album
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Camera
import dev.chiksmedina.solar.lineduotone.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.lineduotone.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.lineduotone.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.lineduotone.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.lineduotone.videoaudiosound.FullScreen
import dev.chiksmedina.solar.lineduotone.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Gallery
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GallerySend
import dev.chiksmedina.solar.lineduotone.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Library
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Microphone
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Microphone2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Microphone3
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Muted
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Panorama
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Pause
import dev.chiksmedina.solar.lineduotone.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Pip
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Pip2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Play
import dev.chiksmedina.solar.lineduotone.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.PlayStream
import dev.chiksmedina.solar.lineduotone.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Podcast
import dev.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.lineduotone.videoaudiosound.QuitPip
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Record
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Reel
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Reel2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Repeat
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RewindBack
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RewindForward
import dev.chiksmedina.solar.lineduotone.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Shuffle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.SkipNext
import dev.chiksmedina.solar.lineduotone.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Soundwave
import dev.chiksmedina.solar.lineduotone.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Stop
import dev.chiksmedina.solar.lineduotone.videoaudiosound.StopCircle
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Stream
import dev.chiksmedina.solar.lineduotone.videoaudiosound.ToPip
import dev.chiksmedina.solar.lineduotone.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.lineduotone.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Videocamera
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Vinyl
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Volume
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.lineduotone.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.lineduotone.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val LineDuotoneSolar.VideoAudioSound: VideoAudioSoundGroup
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
