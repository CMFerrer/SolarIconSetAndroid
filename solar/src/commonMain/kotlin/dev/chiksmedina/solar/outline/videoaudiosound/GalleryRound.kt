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

val VideoAudioSoundGroup.GalleryRound: ImageVector
    get() {
        if (_galleryRound != null) {
            return _galleryRound!!
        }
        _galleryRound = Builder(
            name = "GalleryRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
                curveTo(22.75f, 12.5023f, 22.75f, 12.9287f, 22.7487f, 13.3372f)
                curveTo(22.7507f, 13.3696f, 22.7506f, 13.4025f, 22.7483f, 13.4356f)
                curveTo(22.7418f, 15.1021f, 22.7105f, 16.4688f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.8485f, 22.6594f, 16.0022f, 22.7068f, 15.0326f, 22.7294f)
                curveTo(14.9407f, 22.7515f, 14.843f, 22.7566f, 14.7437f, 22.7414f)
                curveTo(14.7331f, 22.7398f, 14.7227f, 22.7379f, 14.7123f, 22.7359f)
                curveTo(13.9106f, 22.75f, 13.0282f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 11.3365f, 1.25f, 10.7647f, 1.2534f, 10.2256f)
                curveTo(1.2483f, 10.1729f, 1.2488f, 10.1208f, 1.2545f, 10.07f)
                curveTo(1.2657f, 8.6252f, 1.3046f, 7.4187f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(2.7511f, 10.8037f)
                curveTo(2.7501f, 11.1826f, 2.75f, 11.5809f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5645f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(12.8043f, 21.25f, 13.5321f, 21.2498f, 14.1932f, 21.2428f)
                curveTo(14.7361f, 15.0501f, 9.3514f, 9.856f, 3.0873f, 10.7554f)
                lineTo(2.7511f, 10.8037f)
                close()
                moveTo(15.701f, 21.2078f)
                curveTo(16.3323f, 21.182f, 16.8892f, 21.1405f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4356f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.1939f, 16.4918f, 21.2322f, 15.4038f, 21.2443f, 14.0371f)
                lineTo(20.9237f, 13.9927f)
                curveTo(18.5042f, 13.6577f, 16.3037f, 14.7947f, 15.0846f, 16.636f)
                curveTo(15.5911f, 18.0541f, 15.8188f, 19.6005f, 15.701f, 21.2078f)
                close()
                moveTo(14.3874f, 15.0736f)
                curveTo(12.2458f, 11.1169f, 7.7951f, 8.564f, 2.8741f, 9.2706f)
                lineTo(2.7645f, 9.2864f)
                curveTo(2.7833f, 8.2301f, 2.8266f, 7.3554f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                curveTo(4.5645f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4356f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                curveTo(21.2484f, 7.9136f, 21.25f, 9.6218f, 21.25f, 12.0f)
                curveTo(21.25f, 12.1783f, 21.25f, 12.3528f, 21.2499f, 12.5236f)
                lineTo(21.1294f, 12.5069f)
                curveTo(18.4401f, 12.1345f, 15.9698f, 13.22f, 14.3874f, 15.0736f)
                close()
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
        }
            .build()
        return _galleryRound!!
    }

private var _galleryRound: ImageVector? = null
