package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

public val VideoAudioSoundGroup.GalleryCircle: ImageVector
    get() {
        if (_galleryCircle != null) {
            return _galleryCircle!!
        }
        _galleryCircle = Builder(name = "GalleryCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.8301f, 10.7772f)
                lineTo(3.2577f, 10.4031f)
                curveTo(4.4661f, 9.3457f, 6.2874f, 9.4064f, 7.4228f, 10.5418f)
                lineTo(11.7125f, 14.8315f)
                curveTo(12.1421f, 15.261f, 12.8182f, 15.3196f, 13.3152f, 14.9703f)
                lineTo(13.6134f, 14.7607f)
                curveTo(15.0437f, 13.7555f, 16.9788f, 13.872f, 18.2782f, 15.0415f)
                lineTo(20.0211f, 16.6101f)
                curveTo(20.8028f, 15.2529f, 21.25f, 13.6787f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                curveTo(7.3059f, 2.75f, 3.4285f, 6.2466f, 2.8301f, 10.7772f)
                close()
                moveTo(19.1617f, 17.8547f)
                lineTo(17.2747f, 16.1564f)
                curveTo(16.4951f, 15.4547f, 15.334f, 15.3849f, 14.4758f, 15.988f)
                lineTo(14.1776f, 16.1975f)
                curveTo(13.0843f, 16.9659f, 11.5968f, 16.8371f, 10.6519f, 15.8922f)
                lineTo(6.3622f, 11.6024f)
                curveTo(5.7852f, 11.0254f, 4.8596f, 10.9946f, 4.2455f, 11.5319f)
                lineTo(2.785f, 12.8099f)
                curveTo(3.1952f, 17.5392f, 7.1642f, 21.25f, 12.0f, 21.25f)
                curveTo(14.8872f, 21.25f, 17.4654f, 19.9272f, 19.1617f, 17.8547f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(15.0f, 7.75f)
                curveTo(14.3096f, 7.75f, 13.75f, 8.3096f, 13.75f, 9.0f)
                curveTo(13.75f, 9.6904f, 14.3096f, 10.25f, 15.0f, 10.25f)
                curveTo(15.6904f, 10.25f, 16.25f, 9.6904f, 16.25f, 9.0f)
                curveTo(16.25f, 8.3096f, 15.6904f, 7.75f, 15.0f, 7.75f)
                close()
                moveTo(12.25f, 9.0f)
                curveTo(12.25f, 7.4812f, 13.4812f, 6.25f, 15.0f, 6.25f)
                curveTo(16.5188f, 6.25f, 17.75f, 7.4812f, 17.75f, 9.0f)
                curveTo(17.75f, 10.5188f, 16.5188f, 11.75f, 15.0f, 11.75f)
                curveTo(13.4812f, 11.75f, 12.25f, 10.5188f, 12.25f, 9.0f)
                close()
            }
        }
        .build()
        return _galleryCircle!!
    }

private var _galleryCircle: ImageVector? = null
