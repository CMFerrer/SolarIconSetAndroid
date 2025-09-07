package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.KeySquare: ImageVector
    get() {
        if (_keySquare != null) {
            return _keySquare!!
        }
        _keySquare = Builder(
            name = "KeySquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(14.2084f, 6.75f)
                curveTo(12.5257f, 6.75f, 11.1669f, 8.1077f, 11.1669f, 9.7761f)
                curveTo(11.1669f, 10.147f, 11.2521f, 10.4739f, 11.3403f, 10.7111f)
                curveTo(11.3839f, 10.8284f, 11.4268f, 10.9198f, 11.4569f, 10.9786f)
                curveTo(11.4718f, 11.0079f, 11.4834f, 11.0288f, 11.49f, 11.0404f)
                lineTo(11.4956f, 11.0499f)
                curveTo(11.6803f, 11.3443f, 11.6366f, 11.7274f, 11.3904f, 11.9726f)
                lineTo(6.8019f, 16.5424f)
                curveTo(6.8019f, 16.5424f, 6.7979f, 16.5464f, 6.7913f, 16.5551f)
                curveTo(6.7848f, 16.5637f, 6.7779f, 16.5741f, 6.7714f, 16.5857f)
                curveTo(6.7576f, 16.6104f, 6.7521f, 16.6294f, 6.7505f, 16.6391f)
                lineTo(6.7501f, 16.642f)
                lineTo(6.7511f, 16.6443f)
                curveTo(6.7522f, 16.6466f, 6.7541f, 16.6504f, 6.7575f, 16.6557f)
                curveTo(6.7641f, 16.6662f, 6.7772f, 16.6844f, 6.8019f, 16.709f)
                lineTo(7.3004f, 17.2055f)
                lineTo(7.3037f, 17.2076f)
                curveTo(7.3132f, 17.2139f, 7.3249f, 17.2207f, 7.338f, 17.2271f)
                curveTo(7.3658f, 17.2407f, 7.3887f, 17.2472f, 7.4029f, 17.2493f)
                curveTo(7.4066f, 17.2464f, 7.4124f, 17.2422f, 7.4187f, 17.2358f)
                lineTo(8.0359f, 16.6211f)
                curveTo(8.3286f, 16.3297f, 8.8018f, 16.3297f, 9.0944f, 16.6211f)
                curveTo(9.1708f, 16.6972f, 9.2267f, 16.7215f, 9.2557f, 16.7303f)
                curveTo(9.2854f, 16.7394f, 9.3152f, 16.7409f, 9.3499f, 16.7343f)
                curveTo(9.3877f, 16.727f, 9.4311f, 16.7098f, 9.4736f, 16.6824f)
                curveTo(9.5121f, 16.6577f, 9.5372f, 16.6327f, 9.549f, 16.6188f)
                curveTo(9.5842f, 16.5663f, 9.5859f, 16.5279f, 9.5624f, 16.4576f)
                curveTo(9.548f, 16.4146f, 9.5265f, 16.3739f, 9.5069f, 16.3431f)
                curveTo(9.4977f, 16.3287f, 9.4906f, 16.319f, 9.4876f, 16.315f)
                moveTo(11.0441f, 16.8688f)
                curveTo(11.0014f, 17.0748f, 10.914f, 17.2897f, 10.7618f, 17.5018f)
                lineTo(10.7567f, 17.5089f)
                lineTo(10.7515f, 17.5159f)
                curveTo(10.5169f, 17.8274f, 10.1166f, 18.1147f, 9.6321f, 18.2075f)
                curveTo(9.3179f, 18.2677f, 8.9855f, 18.2421f, 8.6659f, 18.1107f)
                lineTo(8.4772f, 18.2987f)
                curveTo(8.0778f, 18.6965f, 7.5964f, 18.7941f, 7.1836f, 18.7331f)
                curveTo(6.8081f, 18.6776f, 6.5009f, 18.4966f, 6.3148f, 18.3377f)
                curveTo(6.3002f, 18.3252f, 6.286f, 18.3122f, 6.2724f, 18.2987f)
                lineTo(5.7434f, 17.7718f)
                curveTo(5.3232f, 17.3533f, 5.1955f, 16.8535f, 5.2701f, 16.3971f)
                curveTo(5.3371f, 15.9878f, 5.5556f, 15.6666f, 5.7434f, 15.4795f)
                lineTo(9.9541f, 11.286f)
                curveTo(9.9475f, 11.269f, 9.941f, 11.2517f, 9.9344f, 11.234f)
                curveTo(9.8021f, 10.8784f, 9.6669f, 10.3711f, 9.6669f, 9.7761f)
                curveTo(9.6669f, 7.2735f, 11.7031f, 5.25f, 14.2084f, 5.25f)
                curveTo(16.7138f, 5.25f, 18.75f, 7.2735f, 18.75f, 9.7761f)
                curveTo(18.75f, 12.2786f, 16.7138f, 14.3021f, 14.2084f, 14.3021f)
                curveTo(13.9722f, 14.3021f, 13.6078f, 14.2761f, 13.2342f, 14.1987f)
                curveTo(13.0881f, 14.1685f, 12.9211f, 14.1266f, 12.7503f, 14.0668f)
                curveTo(12.7705f, 14.0997f, 12.7953f, 14.1424f, 12.8217f, 14.194f)
                curveTo(12.8763f, 14.3006f, 12.9423f, 14.4534f, 12.987f, 14.6401f)
                curveTo(13.0788f, 15.0243f, 13.0799f, 15.5694f, 12.7017f, 16.0968f)
                lineTo(12.6966f, 16.1039f)
                lineTo(12.6913f, 16.1109f)
                curveTo(12.4778f, 16.3944f, 12.0768f, 16.7396f, 11.5244f, 16.8444f)
                curveTo(11.3659f, 16.8745f, 11.2052f, 16.8829f, 11.0441f, 16.8688f)
                close()
                moveTo(9.4876f, 16.315f)
                curveTo(9.24f, 16.0172f, 9.2595f, 15.5782f, 9.5349f, 15.3039f)
                lineTo(9.7113f, 15.1283f)
                curveTo(10.0039f, 14.8368f, 10.4771f, 14.8368f, 10.7698f, 15.1283f)
                curveTo(10.9168f, 15.2747f, 11.0285f, 15.3328f, 11.096f, 15.3563f)
                curveTo(11.1602f, 15.3786f, 11.2071f, 15.3779f, 11.2448f, 15.3707f)
                curveTo(11.3374f, 15.3531f, 11.4355f, 15.2811f, 11.488f, 15.2151f)
                curveTo(11.5454f, 15.1312f, 11.5459f, 15.0635f, 11.5281f, 14.9889f)
                curveTo(11.5176f, 14.9451f, 11.501f, 14.9057f, 11.4867f, 14.8779f)
                curveTo(11.4815f, 14.8678f, 11.4773f, 14.8605f, 11.4749f, 14.8565f)
                lineTo(11.4484f, 14.8195f)
                lineTo(11.4219f, 14.7668f)
                curveTo(11.4203f, 14.7642f, 11.4126f, 14.753f, 11.3863f, 14.7239f)
                lineTo(11.3843f, 14.7219f)
                curveTo(11.367f, 14.704f, 11.239f, 14.572f, 11.1617f, 14.4334f)
                curveTo(11.0318f, 14.2005f, 10.996f, 13.9151f, 11.1081f, 13.6272f)
                curveTo(11.193f, 13.4092f, 11.3465f, 13.2363f, 11.4748f, 13.1085f)
                lineTo(12.0039f, 12.5816f)
                curveTo(12.2779f, 12.3087f, 12.7145f, 12.2889f, 13.0121f, 12.5359f)
                curveTo(13.0788f, 12.5913f, 13.2534f, 12.6709f, 13.5382f, 12.7299f)
                curveTo(13.801f, 12.7843f, 14.0626f, 12.8021f, 14.2084f, 12.8021f)
                curveTo(15.8911f, 12.8021f, 17.25f, 11.4444f, 17.25f, 9.7761f)
                curveTo(17.25f, 8.1077f, 15.8911f, 6.75f, 14.2084f, 6.75f)
                moveTo(14.2084f, 9.2088f)
                curveTo(13.8893f, 9.2088f, 13.6358f, 9.4657f, 13.6358f, 9.7761f)
                curveTo(13.6358f, 10.0864f, 13.8893f, 10.3433f, 14.2084f, 10.3433f)
                curveTo(14.5276f, 10.3433f, 14.7811f, 10.0864f, 14.7811f, 9.7761f)
                curveTo(14.7811f, 9.4657f, 14.5276f, 9.2088f, 14.2084f, 9.2088f)
                close()
                moveTo(12.1358f, 9.7761f)
                curveTo(12.1358f, 8.6315f, 13.0667f, 7.7088f, 14.2084f, 7.7088f)
                curveTo(15.3502f, 7.7088f, 16.2811f, 8.6315f, 16.2811f, 9.7761f)
                curveTo(16.2811f, 10.9207f, 15.3502f, 11.8433f, 14.2084f, 11.8433f)
                curveTo(13.0667f, 11.8433f, 12.1358f, 10.9207f, 12.1358f, 9.7761f)
                close()
            }
        }
            .build()
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
