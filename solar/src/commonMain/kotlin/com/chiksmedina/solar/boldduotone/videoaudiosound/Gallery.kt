package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 9.1046f, 17.1046f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8954f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 14.8954f, 6.0f, 16.0f, 6.0f)
                curveTo(17.1046f, 6.0f, 18.0f, 6.8954f, 18.0f, 8.0f)
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
                verticalLineTo(12.0309f)
                curveTo(22.75f, 13.9397f, 22.75f, 15.5023f, 22.6463f, 16.7745f)
                curveTo(22.5422f, 18.0531f, 22.3287f, 19.1214f, 21.8509f, 20.0087f)
                curveTo(21.6401f, 20.4001f, 21.3812f, 20.7506f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.1409f, 20.2726f, 1.7312f, 19.2852f, 1.5134f, 18.0604f)
                curveTo(1.2994f, 16.8573f, 1.2602f, 15.3603f, 1.2521f, 13.5015f)
                curveTo(1.25f, 13.0287f, 1.25f, 12.5286f, 1.25f, 12.001f)
                lineTo(1.25f, 11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 12.5287f, 2.75f, 13.0257f, 2.752f, 13.4949f)
                curveTo(2.7603f, 15.369f, 2.8021f, 16.7406f, 2.9902f, 17.7978f)
                curveTo(3.1744f, 18.8333f, 3.4877f, 19.4981f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.2151f, 19.7953f, 20.3872f, 19.5631f, 20.5302f, 19.2976f)
                curveTo(20.8619f, 18.6816f, 21.0531f, 17.8578f, 21.1513f, 16.6527f)
                curveTo(21.2494f, 15.4482f, 21.25f, 13.9459f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.6067f, 19.1463f)
                lineTo(17.7763f, 16.599f)
                curveTo(16.7367f, 15.6634f, 15.1886f, 15.5702f, 14.0444f, 16.3744f)
                lineTo(13.7462f, 16.5839f)
                curveTo(12.951f, 17.1428f, 11.8692f, 17.0491f, 11.182f, 16.3618f)
                lineTo(6.8923f, 12.0721f)
                curveTo(6.0361f, 11.2159f, 4.6627f, 11.1702f, 3.7514f, 11.9675f)
                lineTo(2.7502f, 12.8435f)
                curveTo(2.7505f, 13.0665f, 2.751f, 13.2835f, 2.752f, 13.4949f)
                curveTo(2.7602f, 15.369f, 2.802f, 16.7406f, 2.9901f, 17.7978f)
                curveTo(3.1743f, 18.8333f, 3.4876f, 19.4981f, 3.9947f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3351f, 20.9018f, 6.6135f, 21.0736f)
                curveTo(7.9135f, 21.2484f, 9.6217f, 21.25f, 11.9999f, 21.25f)
                curveTo(14.3781f, 21.25f, 16.0863f, 21.2484f, 17.3863f, 21.0736f)
                curveTo(18.6647f, 20.9018f, 19.4354f, 20.5749f, 20.0051f, 20.0052f)
                curveTo(20.215f, 19.7953f, 20.3871f, 19.5631f, 20.5301f, 19.2976f)
                curveTo(20.5565f, 19.2485f, 20.582f, 19.1981f, 20.6067f, 19.1463f)
                close()
            }
        }
            .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
