package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.GalleryFavourite: ImageVector
    get() {
        if (_galleryFavourite != null) {
            return _galleryFavourite!!
        }
        _galleryFavourite = Builder(name = "GalleryFavourite", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.5001f)
                lineTo(3.7516f, 10.9675f)
                curveTo(4.6629f, 10.1702f, 6.0363f, 10.2159f, 6.8925f, 11.0721f)
                lineTo(11.1822f, 15.3618f)
                curveTo(11.8694f, 16.0491f, 12.9512f, 16.1428f, 13.7464f, 15.5839f)
                lineTo(14.0446f, 15.3744f)
                curveTo(15.1888f, 14.5702f, 16.7369f, 14.6634f, 17.7765f, 15.599f)
                lineTo(21.0f, 18.5001f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0603f, 8.5699f)
                lineTo(16.5522f, 8.0037f)
                lineTo(16.5522f, 8.0037f)
                lineTo(16.0603f, 8.5699f)
                close()
                moveTo(18.0f, 3.9679f)
                lineTo(17.4683f, 4.4968f)
                curveTo(17.609f, 4.6383f, 17.8004f, 4.7179f, 18.0f, 4.7179f)
                curveTo(18.1996f, 4.7179f, 18.391f, 4.6383f, 18.5317f, 4.4968f)
                lineTo(18.0f, 3.9679f)
                close()
                moveTo(19.9397f, 8.5699f)
                lineTo(19.4478f, 8.0037f)
                lineTo(19.4478f, 8.0037f)
                lineTo(19.9397f, 8.5699f)
                close()
                moveTo(18.0f, 9.6056f)
                lineTo(18.0f, 8.8556f)
                lineTo(18.0f, 8.8556f)
                lineTo(18.0f, 9.6056f)
                close()
                moveTo(16.5522f, 8.0037f)
                curveTo(16.0663f, 7.5816f, 15.5996f, 7.1093f, 15.2597f, 6.6298f)
                curveTo(14.9126f, 6.1402f, 14.75f, 5.7164f, 14.75f, 5.3754f)
                horizontalLineTo(13.25f)
                curveTo(13.25f, 6.1626f, 13.6077f, 6.8931f, 14.0359f, 7.4972f)
                curveTo(14.4712f, 8.1114f, 15.0347f, 8.6723f, 15.5685f, 9.136f)
                lineTo(16.5522f, 8.0037f)
                close()
                moveTo(14.75f, 5.3754f)
                curveTo(14.75f, 4.4422f, 15.1697f, 3.971f, 15.5841f, 3.8184f)
                curveTo(16.0103f, 3.6616f, 16.7133f, 3.7378f, 17.4683f, 4.4968f)
                lineTo(18.5317f, 3.439f)
                curveTo(17.4867f, 2.3884f, 16.1897f, 1.9971f, 15.066f, 2.4108f)
                curveTo(13.9303f, 2.8288f, 13.25f, 3.9662f, 13.25f, 5.3754f)
                horizontalLineTo(14.75f)
                close()
                moveTo(20.4315f, 9.1361f)
                curveTo(20.9654f, 8.6723f, 21.5288f, 8.1114f, 21.9641f, 7.4972f)
                curveTo(22.3923f, 6.8931f, 22.75f, 6.1626f, 22.75f, 5.3754f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 5.7164f, 21.0874f, 6.1402f, 20.7403f, 6.6298f)
                curveTo(20.4004f, 7.1093f, 19.9337f, 7.5816f, 19.4478f, 8.0037f)
                lineTo(20.4315f, 9.1361f)
                close()
                moveTo(22.75f, 5.3754f)
                curveTo(22.75f, 3.9662f, 22.0697f, 2.8288f, 20.934f, 2.4108f)
                curveTo(19.8103f, 1.9971f, 18.5133f, 2.3884f, 17.4683f, 3.439f)
                lineTo(18.5317f, 4.4968f)
                curveTo(19.2867f, 3.7378f, 19.9897f, 3.6616f, 20.4159f, 3.8184f)
                curveTo(20.8303f, 3.971f, 21.25f, 4.4421f, 21.25f, 5.3754f)
                horizontalLineTo(22.75f)
                close()
                moveTo(15.5685f, 9.136f)
                curveTo(16.3252f, 9.7935f, 16.929f, 10.3556f, 18.0f, 10.3556f)
                lineTo(18.0f, 8.8556f)
                curveTo(17.5762f, 8.8556f, 17.3851f, 8.7273f, 16.5522f, 8.0037f)
                lineTo(15.5685f, 9.136f)
                close()
                moveTo(19.4478f, 8.0037f)
                curveTo(18.6149f, 8.7273f, 18.4239f, 8.8556f, 18.0f, 8.8556f)
                lineTo(18.0f, 10.3556f)
                curveTo(19.071f, 10.3557f, 19.6748f, 9.7935f, 20.4315f, 9.1361f)
                lineTo(19.4478f, 8.0037f)
                close()
            }
        }
        .build()
        return _galleryFavourite!!
    }

private var _galleryFavourite: ImageVector? = null
