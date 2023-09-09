package com.chiksmedina.solar.broken.essentionalui

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
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3057f, 18.2975f)
                lineTo(8.2372f, 19.987f)
                curveTo(5.4718f, 20.9088f, 4.0891f, 21.3697f, 3.3592f, 20.6398f)
                curveTo(2.6294f, 19.9099f, 3.0903f, 18.5272f, 4.0121f, 15.7618f)
                lineTo(5.7016f, 10.6933f)
                curveTo(6.4676f, 8.3953f, 6.8506f, 7.2462f, 7.7568f, 7.0323f)
                curveTo(8.6631f, 6.8183f, 9.5195f, 7.6748f, 11.2324f, 9.3876f)
                lineTo(14.6114f, 12.7666f)
                curveTo(16.3242f, 14.4795f, 17.1807f, 15.3359f, 16.9667f, 16.2422f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2351f, 18.3462f)
                curveTo(12.2351f, 18.3462f, 11.477f, 16.0651f, 11.477f, 14.5554f)
                curveTo(11.477f, 13.0456f, 12.2351f, 10.7645f, 12.2351f, 10.7645f)
                moveTo(8.0652f, 19.4835f)
                curveTo(8.0652f, 19.4835f, 7.4248f, 16.7316f, 7.307f, 14.9345f)
                curveTo(7.1123f, 11.9652f, 8.0652f, 7.3527f, 8.0652f, 7.3527f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5093f, 10.0061f)
                lineTo(14.6533f, 9.2861f)
                curveTo(14.7986f, 8.5592f, 15.3224f, 7.966f, 16.0256f, 7.7316f)
                curveTo(16.7289f, 7.4971f, 17.2526f, 6.9039f, 17.398f, 6.177f)
                lineTo(17.542f, 5.457f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5693f, 13.2533f)
                lineTo(17.7822f, 13.3762f)
                curveTo(18.4393f, 13.7556f, 19.2655f, 13.6719f, 19.8332f, 13.1685f)
                curveTo(20.3473f, 12.7126f, 21.0794f, 12.597f, 21.709f, 12.8723f)
                lineTo(22.0005f, 12.9997f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.7951f, 2.7792f)
                curveTo(9.4576f, 3.3313f, 9.5422f, 4.0427f, 9.9998f, 4.5002f)
                lineTo(10.0976f, 4.5981f)
                curveTo(10.4908f, 4.9912f, 10.6358f, 5.5688f, 10.4749f, 6.101f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9276f, 3.9408f)
                curveTo(7.1371f, 3.7313f, 7.4767f, 3.7313f, 7.6862f, 3.9408f)
                curveTo(7.8956f, 4.1503f, 7.8956f, 4.4899f, 7.6862f, 4.6993f)
                curveTo(7.4767f, 4.9088f, 7.1371f, 4.9088f, 6.9276f, 4.6993f)
                curveTo(6.7181f, 4.4899f, 6.7181f, 4.1503f, 6.9276f, 3.9408f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1571f, 7.1571f)
                curveTo(12.3666f, 6.9476f, 12.7062f, 6.9476f, 12.9157f, 7.1571f)
                curveTo(13.1251f, 7.3666f, 13.1251f, 7.7062f, 12.9157f, 7.9157f)
                curveTo(12.7062f, 8.1251f, 12.3666f, 8.1251f, 12.1571f, 7.9157f)
                curveTo(11.9476f, 7.7062f, 11.9476f, 7.3666f, 12.1571f, 7.1571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1571f, 10.1571f)
                curveTo(17.3666f, 9.9476f, 17.7062f, 9.9476f, 17.9157f, 10.1571f)
                curveTo(18.1251f, 10.3666f, 18.1251f, 10.7062f, 17.9157f, 10.9157f)
                curveTo(17.7062f, 11.1251f, 17.3666f, 11.1251f, 17.1571f, 10.9157f)
                curveTo(16.9476f, 10.7062f, 16.9476f, 10.3666f, 17.1571f, 10.1571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0582f, 15.3134f)
                curveTo(19.2677f, 15.1039f, 19.6073f, 15.1039f, 19.8168f, 15.3134f)
                curveTo(20.0262f, 15.5228f, 20.0262f, 15.8624f, 19.8168f, 16.0719f)
                curveTo(19.6073f, 16.2814f, 19.2677f, 16.2814f, 19.0582f, 16.0719f)
                curveTo(18.8488f, 15.8624f, 18.8488f, 15.5228f, 19.0582f, 15.3134f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3615f, 7.7142f)
                curveTo(18.6912f, 8.3844f, 19.1722f, 10.3278f, 19.1722f, 10.3278f)
                curveTo(19.1722f, 10.3278f, 21.1156f, 10.8088f, 21.7859f, 10.1385f)
                curveTo(22.4958f, 9.4287f, 22.0941f, 8.4969f, 21.0002f, 8.4998f)
                curveTo(21.0032f, 7.406f, 20.0714f, 7.0043f, 19.3615f, 7.7142f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.1884f, 3.4174f)
                lineTo(15.1608f, 3.5145f)
                curveTo(15.1305f, 3.6212f, 15.1153f, 3.6745f, 15.1225f, 3.7269f)
                curveTo(15.1296f, 3.7792f, 15.1583f, 3.8247f, 15.2157f, 3.9156f)
                lineTo(15.2679f, 3.9984f)
                curveTo(15.4698f, 4.3183f, 15.5707f, 4.4783f, 15.5019f, 4.6091f)
                curveTo(15.4332f, 4.7399f, 15.2402f, 4.755f, 14.8544f, 4.7851f)
                lineTo(14.7546f, 4.7929f)
                curveTo(14.6449f, 4.8015f, 14.5901f, 4.8057f, 14.5422f, 4.8309f)
                curveTo(14.4943f, 4.8561f, 14.4587f, 4.8994f, 14.3875f, 4.9859f)
                lineTo(14.3226f, 5.0646f)
                curveTo(14.072f, 5.369f, 13.9467f, 5.5212f, 13.8038f, 5.5016f)
                curveTo(13.6609f, 5.482f, 13.595f, 5.3037f, 13.4632f, 4.9469f)
                lineTo(13.4291f, 4.8546f)
                curveTo(13.3916f, 4.7533f, 13.3729f, 4.7026f, 13.3361f, 4.6658f)
                curveTo(13.2993f, 4.629f, 13.2486f, 4.6103f, 13.1472f, 4.5728f)
                lineTo(13.0549f, 4.5387f)
                curveTo(12.6982f, 4.4069f, 12.5198f, 4.341f, 12.5003f, 4.1981f)
                curveTo(12.4807f, 4.0552f, 12.6329f, 3.9299f, 12.9373f, 3.6793f)
                lineTo(13.016f, 3.6144f)
                curveTo(13.1025f, 3.5432f, 13.1458f, 3.5076f, 13.1709f, 3.4597f)
                curveTo(13.1961f, 3.4118f, 13.2004f, 3.3569f, 13.209f, 3.2473f)
                lineTo(13.2168f, 3.1475f)
                curveTo(13.2469f, 2.7616f, 13.262f, 2.5687f, 13.3928f, 2.4999f)
                curveTo(13.5236f, 2.4312f, 13.6836f, 2.5321f, 14.0035f, 2.734f)
                lineTo(14.0863f, 2.7862f)
                curveTo(14.1772f, 2.8436f, 14.2226f, 2.8722f, 14.275f, 2.8794f)
                curveTo(14.3273f, 2.8866f, 14.3807f, 2.8714f, 14.4873f, 2.8411f)
                lineTo(14.5845f, 2.8135f)
                curveTo(14.9598f, 2.7069f, 15.1475f, 2.6535f, 15.2479f, 2.754f)
                curveTo(15.3483f, 2.8544f, 15.295f, 3.0421f, 15.1884f, 3.4174f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
