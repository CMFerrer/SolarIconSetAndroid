package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.GallerySend: ImageVector
    get() {
        if (_gallerySend != null) {
            return _gallerySend!!
        }
        _gallerySend = Builder(
            name = "GallerySend", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 11.75f)
                curveTo(17.4142f, 11.75f, 17.75f, 11.4142f, 17.75f, 11.0f)
                verticalLineTo(3.8107f)
                lineTo(19.4697f, 5.5303f)
                curveTo(19.7626f, 5.8232f, 20.2374f, 5.8232f, 20.5303f, 5.5303f)
                curveTo(20.8232f, 5.2374f, 20.8232f, 4.7626f, 20.5303f, 4.4697f)
                lineTo(17.5303f, 1.4697f)
                curveTo(17.2374f, 1.1768f, 16.7626f, 1.1768f, 16.4697f, 1.4697f)
                lineTo(13.4697f, 4.4697f)
                curveTo(13.1768f, 4.7626f, 13.1768f, 5.2374f, 13.4697f, 5.5303f)
                curveTo(13.7626f, 5.8232f, 14.2374f, 5.8232f, 14.5303f, 5.5303f)
                lineTo(16.25f, 3.8107f)
                verticalLineTo(11.0f)
                curveTo(16.25f, 11.4142f, 16.5858f, 11.75f, 17.0f, 11.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                lineTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                curveTo(21.5858f, 11.25f, 21.25f, 11.5858f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(21.0667f, 17.4377f, 21.0596f, 17.4882f, 21.0522f, 17.5378f)
                lineTo(18.2782f, 15.0412f)
                curveTo(16.9788f, 13.8718f, 15.0437f, 13.7553f, 13.6134f, 14.7605f)
                lineTo(13.3152f, 14.9701f)
                curveTo(12.8182f, 15.3193f, 12.1421f, 15.2608f, 11.7125f, 14.8313f)
                lineTo(7.4228f, 10.5415f)
                curveTo(6.2874f, 9.4061f, 4.4661f, 9.3455f, 3.2577f, 10.4028f)
                lineTo(2.751f, 10.8462f)
                curveTo(2.7555f, 9.054f, 2.7812f, 7.693f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4142f, 2.75f, 12.75f, 2.4142f, 12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.2487f, 19.7617f, 20.4479f, 19.4814f, 20.6096f, 19.1404f)
                curveTo(20.5707f, 19.1166f, 20.5334f, 19.089f, 20.4983f, 19.0574f)
                lineTo(17.2747f, 16.1562f)
                curveTo(16.4951f, 15.4545f, 15.334f, 15.3846f, 14.4758f, 15.9877f)
                lineTo(14.1776f, 16.1973f)
                curveTo(13.0843f, 16.9657f, 11.5968f, 16.8369f, 10.6519f, 15.8919f)
                lineTo(6.3622f, 11.6022f)
                curveTo(5.7852f, 11.0252f, 4.8596f, 10.9944f, 4.2455f, 11.5317f)
                lineTo(2.7504f, 12.8399f)
                curveTo(2.753f, 14.7884f, 2.7729f, 16.2448f, 2.9264f, 17.3864f)
                close()
            }
        }
            .build()
        return _gallerySend!!
    }

private var _gallerySend: ImageVector? = null
