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

val VideoAudioSoundGroup.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(
            name = "Gallery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.0f, 6.75f)
                curveTo(15.3096f, 6.75f, 14.75f, 7.3096f, 14.75f, 8.0f)
                curveTo(14.75f, 8.6904f, 15.3096f, 9.25f, 16.0f, 9.25f)
                curveTo(16.6904f, 9.25f, 17.25f, 8.6904f, 17.25f, 8.0f)
                curveTo(17.25f, 7.3096f, 16.6904f, 6.75f, 16.0f, 6.75f)
                close()
                moveTo(13.25f, 8.0f)
                curveTo(13.25f, 6.4812f, 14.4812f, 5.25f, 16.0f, 5.25f)
                curveTo(17.5188f, 5.25f, 18.75f, 6.4812f, 18.75f, 8.0f)
                curveTo(18.75f, 9.5188f, 17.5188f, 10.75f, 16.0f, 10.75f)
                curveTo(14.4812f, 10.75f, 13.25f, 9.5188f, 13.25f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7729f, 16.2449f, 2.753f, 14.7885f, 2.7504f, 12.8401f)
                lineTo(4.2455f, 11.5319f)
                curveTo(4.8596f, 10.9946f, 5.7852f, 11.0254f, 6.3622f, 11.6024f)
                lineTo(10.6519f, 15.8922f)
                curveTo(11.5968f, 16.8371f, 13.0843f, 16.9659f, 14.1776f, 16.1975f)
                lineTo(14.4758f, 15.988f)
                curveTo(15.334f, 15.3849f, 16.4951f, 15.4547f, 17.2747f, 16.1564f)
                lineTo(20.4983f, 19.0576f)
                curveTo(20.5334f, 19.0892f, 20.5706f, 19.1168f, 20.6095f, 19.1406f)
                curveTo(20.4478f, 19.4815f, 20.2487f, 19.7617f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7812f, 7.6931f, 2.7555f, 9.0541f, 2.751f, 10.8465f)
                lineTo(3.2577f, 10.4031f)
                curveTo(4.4661f, 9.3457f, 6.2874f, 9.4064f, 7.4228f, 10.5418f)
                lineTo(11.7125f, 14.8315f)
                curveTo(12.1421f, 15.261f, 12.8182f, 15.3196f, 13.3152f, 14.9703f)
                lineTo(13.6134f, 14.7607f)
                curveTo(15.0437f, 13.7555f, 16.9788f, 13.872f, 18.2782f, 15.0415f)
                lineTo(21.0522f, 17.5381f)
                curveTo(21.0596f, 17.4883f, 21.0667f, 17.4378f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
            }
        }
            .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
