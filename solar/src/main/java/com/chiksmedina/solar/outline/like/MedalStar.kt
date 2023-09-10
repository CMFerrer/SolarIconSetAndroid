package com.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.LikeGroup

val LikeGroup.MedalStar: ImageVector
    get() {
        if (_medalStar != null) {
            return _medalStar!!
        }
        _medalStar = Builder(
            name = "MedalStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.948f, 1.25f)
                horizontalLineTo(13.052f)
                curveTo(13.9505f, 1.25f, 14.6997f, 1.25f, 15.2945f, 1.3299f)
                curveTo(15.9223f, 1.4143f, 16.4891f, 1.6f, 16.9445f, 2.0555f)
                curveTo(17.4f, 2.5109f, 17.5857f, 3.0777f, 17.6701f, 3.7055f)
                curveTo(17.75f, 4.3003f, 17.75f, 5.0495f, 17.75f, 5.948f)
                lineTo(17.75f, 7.2811f)
                lineTo(18.5894f, 7.7388f)
                curveTo(19.7944f, 8.3959f, 20.5442f, 9.6587f, 20.5442f, 11.0312f)
                verticalLineTo(15.9688f)
                curveTo(20.5442f, 17.3413f, 19.7944f, 18.6041f, 18.5894f, 19.2612f)
                lineTo(13.7952f, 21.8754f)
                curveTo(12.6762f, 22.4855f, 11.3238f, 22.4855f, 10.2047f, 21.8754f)
                lineTo(5.4105f, 19.2612f)
                curveTo(4.2055f, 18.6041f, 3.4557f, 17.3413f, 3.4557f, 15.9688f)
                verticalLineTo(11.0312f)
                curveTo(3.4557f, 9.6587f, 4.2055f, 8.3959f, 5.4105f, 7.7388f)
                lineTo(6.25f, 7.2811f)
                lineTo(6.25f, 5.948f)
                curveTo(6.2499f, 5.0495f, 6.2499f, 4.3003f, 6.3299f, 3.7055f)
                curveTo(6.4143f, 3.0777f, 6.6f, 2.5109f, 7.0554f, 2.0555f)
                curveTo(7.5109f, 1.6f, 8.0777f, 1.4143f, 8.7055f, 1.3299f)
                curveTo(9.3003f, 1.25f, 10.0495f, 1.25f, 10.948f, 1.25f)
                close()
                moveTo(7.75f, 6.4632f)
                lineTo(10.2047f, 5.1247f)
                curveTo(11.3238f, 4.5145f, 12.6762f, 4.5145f, 13.7952f, 5.1247f)
                lineTo(16.25f, 6.4632f)
                verticalLineTo(6.0f)
                curveTo(16.25f, 5.036f, 16.2484f, 4.3884f, 16.1834f, 3.9054f)
                curveTo(16.1214f, 3.4439f, 16.0142f, 3.2464f, 15.8839f, 3.1161f)
                curveTo(15.7535f, 2.9858f, 15.556f, 2.8786f, 15.0946f, 2.8165f)
                curveTo(14.6115f, 2.7516f, 13.964f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 2.75f, 9.3884f, 2.7516f, 8.9054f, 2.8165f)
                curveTo(8.4439f, 2.8786f, 8.2464f, 2.9858f, 8.1161f, 3.1161f)
                curveTo(7.9858f, 3.2464f, 7.8786f, 3.4439f, 7.8165f, 3.9054f)
                curveTo(7.7516f, 4.3884f, 7.75f, 5.036f, 7.75f, 6.0f)
                verticalLineTo(6.4632f)
                close()
                moveTo(13.0771f, 6.4416f)
                curveTo(12.4057f, 6.0755f, 11.5943f, 6.0755f, 10.9228f, 6.4416f)
                lineTo(6.1286f, 9.0558f)
                curveTo(5.4056f, 9.45f, 4.9557f, 10.2077f, 4.9557f, 11.0312f)
                verticalLineTo(15.9688f)
                curveTo(4.9557f, 16.7923f, 5.4056f, 17.55f, 6.1286f, 17.9442f)
                lineTo(10.9228f, 20.5584f)
                curveTo(11.5943f, 20.9245f, 12.4057f, 20.9245f, 13.0771f, 20.5584f)
                lineTo(17.8714f, 17.9442f)
                curveTo(18.5943f, 17.55f, 19.0442f, 16.7923f, 19.0442f, 15.9688f)
                verticalLineTo(11.0312f)
                curveTo(19.0442f, 10.2077f, 18.5943f, 9.45f, 17.8713f, 9.0558f)
                lineTo(13.0771f, 6.4416f)
                close()
                moveTo(12.0f, 11.5346f)
                curveTo(11.9418f, 11.6353f, 11.8772f, 11.7512f, 11.801f, 11.8878f)
                lineTo(11.7027f, 12.0642f)
                curveTo(11.6958f, 12.0767f, 11.6883f, 12.0903f, 11.6804f, 12.1048f)
                curveTo(11.6018f, 12.2484f, 11.4718f, 12.4863f, 11.2549f, 12.6509f)
                curveTo(11.0336f, 12.8189f, 10.7673f, 12.8767f, 10.6116f, 12.9106f)
                curveTo(10.596f, 12.9139f, 10.5815f, 12.9171f, 10.5683f, 12.9201f)
                lineTo(10.3773f, 12.9633f)
                curveTo(10.2022f, 13.0029f, 10.0595f, 13.0353f, 9.9375f, 13.0659f)
                curveTo(10.0168f, 13.1636f, 10.1199f, 13.2849f, 10.254f, 13.4417f)
                lineTo(10.3842f, 13.5939f)
                curveTo(10.3934f, 13.6047f, 10.4034f, 13.6162f, 10.4141f, 13.6286f)
                curveTo(10.5221f, 13.7529f, 10.6963f, 13.9536f, 10.7769f, 14.2128f)
                curveTo(10.8565f, 14.4688f, 10.8291f, 14.7326f, 10.8117f, 14.899f)
                curveTo(10.81f, 14.9156f, 10.8084f, 14.9312f, 10.807f, 14.9458f)
                lineTo(10.7873f, 15.1488f)
                curveTo(10.7691f, 15.3371f, 10.7549f, 15.4873f, 10.7454f, 15.6095f)
                curveTo(10.8496f, 15.5636f, 10.9682f, 15.5091f, 11.109f, 15.4443f)
                lineTo(11.2878f, 15.362f)
                curveTo(11.3001f, 15.3563f, 11.3135f, 15.3499f, 11.3281f, 15.3431f)
                curveTo(11.4716f, 15.2754f, 11.7213f, 15.1576f, 12.0f, 15.1576f)
                curveTo(12.2786f, 15.1576f, 12.5283f, 15.2754f, 12.6718f, 15.3431f)
                curveTo(12.6864f, 15.3499f, 12.6999f, 15.3563f, 12.7122f, 15.362f)
                lineTo(12.891f, 15.4443f)
                curveTo(13.0318f, 15.5091f, 13.1503f, 15.5636f, 13.2545f, 15.6095f)
                curveTo(13.2451f, 15.4873f, 13.2309f, 15.3371f, 13.2127f, 15.1488f)
                lineTo(13.193f, 14.9458f)
                curveTo(13.1916f, 14.9312f, 13.1899f, 14.9156f, 13.1882f, 14.899f)
                curveTo(13.1709f, 14.7326f, 13.1434f, 14.4689f, 13.223f, 14.2128f)
                curveTo(13.3036f, 13.9536f, 13.4779f, 13.7529f, 13.5858f, 13.6286f)
                curveTo(13.5965f, 13.6162f, 13.6066f, 13.6047f, 13.6158f, 13.5939f)
                lineTo(13.7459f, 13.4417f)
                curveTo(13.88f, 13.2849f, 13.9831f, 13.1636f, 14.0625f, 13.0659f)
                curveTo(13.9405f, 13.0353f, 13.7978f, 13.0029f, 13.6226f, 12.9633f)
                lineTo(13.4317f, 12.9201f)
                curveTo(13.4185f, 12.9171f, 13.404f, 12.9139f, 13.3884f, 12.9106f)
                curveTo(13.2327f, 12.8767f, 12.9664f, 12.8189f, 12.745f, 12.6509f)
                curveTo(12.5282f, 12.4863f, 12.3981f, 12.2484f, 12.3196f, 12.1048f)
                curveTo(12.3116f, 12.0902f, 12.3042f, 12.0767f, 12.2972f, 12.0642f)
                lineTo(12.1989f, 11.8878f)
                curveTo(12.1228f, 11.7512f, 12.0581f, 11.6353f, 12.0f, 11.5346f)
                close()
                moveTo(11.0135f, 10.2998f)
                curveTo(11.1856f, 10.075f, 11.4983f, 9.7502f, 12.0f, 9.7502f)
                curveTo(12.5017f, 9.7502f, 12.8143f, 10.075f, 12.9865f, 10.2998f)
                curveTo(13.1508f, 10.5144f, 13.3163f, 10.8114f, 13.486f, 11.1159f)
                curveTo(13.4937f, 11.1298f, 13.5014f, 11.1436f, 13.5091f, 11.1575f)
                lineTo(13.6074f, 11.3339f)
                curveTo(13.6302f, 11.3748f, 13.6482f, 11.4069f, 13.6639f, 11.4345f)
                curveTo(13.6912f, 11.4409f, 13.723f, 11.4481f, 13.7627f, 11.4571f)
                lineTo(13.9536f, 11.5003f)
                curveTo(13.9693f, 11.5038f, 13.9849f, 11.5073f, 14.0005f, 11.5109f)
                curveTo(14.3284f, 11.5849f, 14.6541f, 11.6586f, 14.9042f, 11.7571f)
                curveTo(15.1804f, 11.8659f, 15.5547f, 12.0779f, 15.6989f, 12.5418f)
                curveTo(15.8406f, 12.9975f, 15.6618f, 13.3835f, 15.5056f, 13.6316f)
                curveTo(15.3611f, 13.8612f, 15.1414f, 14.118f, 14.9165f, 14.3809f)
                curveTo(14.9063f, 14.3928f, 14.8961f, 14.4047f, 14.8859f, 14.4166f)
                lineTo(14.7558f, 14.5688f)
                curveTo(14.7213f, 14.6091f, 14.6953f, 14.6395f, 14.6734f, 14.6658f)
                curveTo(14.6764f, 14.7022f, 14.6805f, 14.7445f, 14.686f, 14.8011f)
                lineTo(14.7057f, 15.0041f)
                curveTo(14.7072f, 15.0196f, 14.7087f, 15.0351f, 14.7102f, 15.0505f)
                curveTo(14.7443f, 15.4025f, 14.7774f, 15.7426f, 14.7653f, 16.0146f)
                curveTo(14.7525f, 16.2999f, 14.6841f, 16.7317f, 14.2969f, 17.0256f)
                curveTo(13.8975f, 17.3288f, 13.4564f, 17.2627f, 13.1767f, 17.1826f)
                curveTo(12.9189f, 17.1087f, 12.6144f, 16.9684f, 12.3077f, 16.8271f)
                curveTo(12.293f, 16.8203f, 12.2783f, 16.8135f, 12.2636f, 16.8068f)
                lineTo(12.0849f, 16.7245f)
                curveTo(12.0514f, 16.7091f, 12.0239f, 16.6964f, 12.0f, 16.6856f)
                curveTo(11.976f, 16.6964f, 11.9485f, 16.7091f, 11.9151f, 16.7245f)
                lineTo(11.7364f, 16.8068f)
                curveTo(11.7217f, 16.8135f, 11.707f, 16.8203f, 11.6923f, 16.8271f)
                curveTo(11.3856f, 16.9684f, 11.081f, 17.1087f, 10.8233f, 17.1826f)
                curveTo(10.5436f, 17.2627f, 10.1024f, 17.3288f, 9.703f, 17.0256f)
                curveTo(9.3159f, 16.7317f, 9.2474f, 16.2999f, 9.2347f, 16.0146f)
                curveTo(9.2226f, 15.7426f, 9.2556f, 15.4025f, 9.2898f, 15.0506f)
                curveTo(9.2913f, 15.0351f, 9.2928f, 15.0196f, 9.2943f, 15.0041f)
                lineTo(9.314f, 14.8011f)
                curveTo(9.3195f, 14.7445f, 9.3235f, 14.7022f, 9.3265f, 14.6658f)
                curveTo(9.3046f, 14.6395f, 9.2786f, 14.6091f, 9.2442f, 14.5688f)
                lineTo(9.114f, 14.4166f)
                curveTo(9.1038f, 14.4047f, 9.0936f, 14.3928f, 9.0835f, 14.3809f)
                curveTo(8.8586f, 14.118f, 8.6389f, 13.8612f, 8.4943f, 13.6316f)
                curveTo(8.3382f, 13.3835f, 8.1593f, 12.9975f, 8.301f, 12.5418f)
                curveTo(8.4453f, 12.0779f, 8.8196f, 11.8659f, 9.0957f, 11.7571f)
                curveTo(9.3458f, 11.6586f, 9.6716f, 11.5849f, 9.9994f, 11.5109f)
                curveTo(10.015f, 11.5073f, 10.0307f, 11.5038f, 10.0463f, 11.5003f)
                lineTo(10.2372f, 11.4571f)
                curveTo(10.277f, 11.4481f, 10.3087f, 11.4409f, 10.3361f, 11.4345f)
                curveTo(10.3518f, 11.4069f, 10.3697f, 11.3748f, 10.3925f, 11.3339f)
                lineTo(10.4908f, 11.1575f)
                curveTo(10.4986f, 11.1436f, 10.5063f, 11.1298f, 10.514f, 11.1159f)
                curveTo(10.6837f, 10.8114f, 10.8491f, 10.5144f, 11.0135f, 10.2998f)
                close()
            }
        }
            .build()
        return _medalStar!!
    }

private var _medalStar: ImageVector? = null
