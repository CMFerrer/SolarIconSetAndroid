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

val LikeGroup.MedalStarCircle: ImageVector
    get() {
        if (_medalStarCircle != null) {
            return _medalStarCircle!!
        }
        _medalStarCircle = Builder(
            name = "MedalStarCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(17.7501f, 4.3003f, 17.75f, 5.0495f, 17.75f, 5.948f)
                lineTo(17.75f, 7.4044f)
                curveTo(19.5884f, 9.0084f, 20.75f, 11.3686f, 20.75f, 14.0f)
                curveTo(20.75f, 18.8325f, 16.8325f, 22.75f, 12.0f, 22.75f)
                curveTo(7.1675f, 22.75f, 3.25f, 18.8325f, 3.25f, 14.0f)
                curveTo(3.25f, 11.3686f, 4.4116f, 9.0084f, 6.25f, 7.4044f)
                lineTo(6.25f, 5.948f)
                curveTo(6.25f, 5.0495f, 6.2499f, 4.3003f, 6.3299f, 3.7055f)
                curveTo(6.4143f, 3.0777f, 6.6f, 2.5109f, 7.0555f, 2.0555f)
                curveTo(7.5109f, 1.6f, 8.0777f, 1.4143f, 8.7055f, 1.3299f)
                curveTo(9.3003f, 1.25f, 10.0495f, 1.25f, 10.948f, 1.25f)
                close()
                moveTo(7.75f, 6.3496f)
                curveTo(9.0084f, 5.6491f, 10.4576f, 5.25f, 12.0f, 5.25f)
                curveTo(13.5424f, 5.25f, 14.9916f, 5.6491f, 16.25f, 6.3496f)
                verticalLineTo(6.0f)
                curveTo(16.25f, 5.036f, 16.2484f, 4.3884f, 16.1835f, 3.9054f)
                curveTo(16.1214f, 3.4439f, 16.0142f, 3.2464f, 15.8839f, 3.1161f)
                curveTo(15.7536f, 2.9858f, 15.5561f, 2.8786f, 15.0946f, 2.8165f)
                curveTo(14.6116f, 2.7516f, 13.964f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 2.75f, 9.3884f, 2.7516f, 8.9054f, 2.8165f)
                curveTo(8.4439f, 2.8786f, 8.2464f, 2.9858f, 8.1161f, 3.1161f)
                curveTo(7.9858f, 3.2464f, 7.8786f, 3.4439f, 7.8165f, 3.9054f)
                curveTo(7.7516f, 4.3884f, 7.75f, 5.036f, 7.75f, 6.0f)
                verticalLineTo(6.3496f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(7.9959f, 6.75f, 4.75f, 9.9959f, 4.75f, 14.0f)
                curveTo(4.75f, 18.0041f, 7.9959f, 21.25f, 12.0f, 21.25f)
                curveTo(16.0041f, 21.25f, 19.25f, 18.0041f, 19.25f, 14.0f)
                curveTo(19.25f, 9.9959f, 16.0041f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(12.0f, 12.0345f)
                curveTo(11.9419f, 12.1351f, 11.8772f, 12.251f, 11.801f, 12.3877f)
                lineTo(11.7027f, 12.564f)
                curveTo(11.6958f, 12.5765f, 11.6884f, 12.5901f, 11.6804f, 12.6047f)
                curveTo(11.6019f, 12.7483f, 11.4718f, 12.9861f, 11.255f, 13.1507f)
                curveTo(11.0336f, 13.3188f, 10.7673f, 13.3766f, 10.6116f, 13.4104f)
                curveTo(10.596f, 13.4138f, 10.5815f, 13.4169f, 10.5683f, 13.4199f)
                lineTo(10.3774f, 13.4631f)
                curveTo(10.2022f, 13.5028f, 10.0595f, 13.5351f, 9.9375f, 13.5658f)
                curveTo(10.0169f, 13.6634f, 10.1199f, 13.7847f, 10.254f, 13.9415f)
                lineTo(10.3842f, 14.0937f)
                curveTo(10.3934f, 14.1045f, 10.4035f, 14.1161f, 10.4141f, 14.1284f)
                curveTo(10.5221f, 14.2527f, 10.6963f, 14.4535f, 10.7769f, 14.7126f)
                curveTo(10.8566f, 14.9687f, 10.8291f, 15.2324f, 10.8118f, 15.3988f)
                curveTo(10.81f, 15.4154f, 10.8084f, 15.431f, 10.807f, 15.4456f)
                lineTo(10.7873f, 15.6487f)
                curveTo(10.7691f, 15.8369f, 10.7549f, 15.9872f, 10.7455f, 16.1094f)
                curveTo(10.8497f, 16.0635f, 10.9682f, 16.0089f, 11.109f, 15.9441f)
                lineTo(11.2878f, 15.8618f)
                curveTo(11.3001f, 15.8561f, 11.3136f, 15.8498f, 11.3281f, 15.8429f)
                curveTo(11.4716f, 15.7752f, 11.7213f, 15.6575f, 12.0f, 15.6575f)
                curveTo(12.2787f, 15.6575f, 12.5284f, 15.7752f, 12.6719f, 15.8429f)
                curveTo(12.6864f, 15.8498f, 12.6999f, 15.8561f, 12.7122f, 15.8618f)
                lineTo(12.891f, 15.9441f)
                curveTo(13.0318f, 16.0089f, 13.1503f, 16.0635f, 13.2545f, 16.1094f)
                curveTo(13.2451f, 15.9872f, 13.2309f, 15.8369f, 13.2127f, 15.6487f)
                lineTo(13.193f, 15.4456f)
                curveTo(13.1916f, 15.4311f, 13.19f, 15.4154f, 13.1882f, 15.3988f)
                curveTo(13.1709f, 15.2324f, 13.1434f, 14.9687f, 13.2231f, 14.7126f)
                curveTo(13.3037f, 14.4535f, 13.4779f, 14.2527f, 13.5859f, 14.1284f)
                curveTo(13.5965f, 14.1161f, 13.6066f, 14.1045f, 13.6158f, 14.0937f)
                lineTo(13.746f, 13.9415f)
                curveTo(13.8801f, 13.7847f, 13.9831f, 13.6634f, 14.0625f, 13.5658f)
                curveTo(13.9405f, 13.5351f, 13.7978f, 13.5028f, 13.6226f, 13.4631f)
                lineTo(13.4317f, 13.4199f)
                curveTo(13.4185f, 13.4169f, 13.404f, 13.4138f, 13.3884f, 13.4104f)
                curveTo(13.2327f, 13.3766f, 12.9664f, 13.3188f, 12.745f, 13.1507f)
                curveTo(12.5282f, 12.9861f, 12.3981f, 12.7483f, 12.3196f, 12.6047f)
                curveTo(12.3116f, 12.5901f, 12.3042f, 12.5765f, 12.2973f, 12.564f)
                lineTo(12.199f, 12.3877f)
                curveTo(12.1228f, 12.251f, 12.0581f, 12.1351f, 12.0f, 12.0345f)
                close()
                moveTo(11.0135f, 10.7996f)
                curveTo(11.1857f, 10.5748f, 11.4983f, 10.25f, 12.0f, 10.25f)
                curveTo(12.5017f, 10.25f, 12.8143f, 10.5748f, 12.9865f, 10.7996f)
                curveTo(13.1508f, 11.0142f, 13.3163f, 11.3112f, 13.486f, 11.6158f)
                curveTo(13.4937f, 11.6296f, 13.5014f, 11.6435f, 13.5091f, 11.6573f)
                lineTo(13.6075f, 11.8337f)
                curveTo(13.6303f, 11.8746f, 13.6482f, 11.9068f, 13.6639f, 11.9343f)
                curveTo(13.6912f, 11.9407f, 13.723f, 11.9479f, 13.7627f, 11.9569f)
                lineTo(13.9536f, 12.0001f)
                curveTo(13.9693f, 12.0036f, 13.9849f, 12.0072f, 14.0006f, 12.0107f)
                curveTo(14.3284f, 12.0848f, 14.6542f, 12.1584f, 14.9042f, 12.257f)
                curveTo(15.1804f, 12.3658f, 15.5547f, 12.5777f, 15.6989f, 13.0416f)
                curveTo(15.8407f, 13.4973f, 15.6618f, 13.8834f, 15.5056f, 14.1315f)
                curveTo(15.3611f, 14.3611f, 15.1414f, 14.6179f, 14.9165f, 14.8808f)
                curveTo(14.9063f, 14.8926f, 14.8961f, 14.9045f, 14.886f, 14.9164f)
                lineTo(14.7558f, 15.0686f)
                curveTo(14.7213f, 15.1089f, 14.6953f, 15.1394f, 14.6735f, 15.1657f)
                curveTo(14.6764f, 15.202f, 14.6805f, 15.2443f, 14.686f, 15.3009f)
                lineTo(14.7057f, 15.504f)
                curveTo(14.7072f, 15.5195f, 14.7087f, 15.5349f, 14.7102f, 15.5504f)
                curveTo(14.7444f, 15.9023f, 14.7774f, 16.2424f, 14.7653f, 16.5145f)
                curveTo(14.7526f, 16.7997f, 14.6841f, 17.2315f, 14.2969f, 17.5254f)
                curveTo(13.8975f, 17.8286f, 13.4564f, 17.7626f, 13.1767f, 17.6824f)
                curveTo(12.9189f, 17.6086f, 12.6144f, 17.4682f, 12.3077f, 17.3269f)
                curveTo(12.293f, 17.3201f, 12.2783f, 17.3134f, 12.2636f, 17.3066f)
                lineTo(12.0849f, 17.2243f)
                curveTo(12.0514f, 17.2089f, 12.024f, 17.1963f, 12.0f, 17.1854f)
                curveTo(11.976f, 17.1963f, 11.9486f, 17.2089f, 11.9151f, 17.2243f)
                lineTo(11.7364f, 17.3066f)
                curveTo(11.7217f, 17.3134f, 11.707f, 17.3201f, 11.6923f, 17.3269f)
                curveTo(11.3856f, 17.4682f, 11.081f, 17.6086f, 10.8233f, 17.6824f)
                curveTo(10.5436f, 17.7626f, 10.1025f, 17.8286f, 9.7031f, 17.5254f)
                curveTo(9.3159f, 17.2315f, 9.2474f, 16.7997f, 9.2347f, 16.5145f)
                curveTo(9.2226f, 16.2424f, 9.2556f, 15.9023f, 9.2898f, 15.5504f)
                curveTo(9.2913f, 15.5349f, 9.2928f, 15.5195f, 9.2943f, 15.504f)
                lineTo(9.314f, 15.3009f)
                curveTo(9.3195f, 15.2443f, 9.3236f, 15.202f, 9.3265f, 15.1657f)
                curveTo(9.3047f, 15.1394f, 9.2787f, 15.1089f, 9.2442f, 15.0686f)
                lineTo(9.114f, 14.9164f)
                curveTo(9.1039f, 14.9045f, 9.0937f, 14.8926f, 9.0835f, 14.8807f)
                curveTo(8.8586f, 14.6179f, 8.6389f, 14.3611f, 8.4944f, 14.1315f)
                curveTo(8.3382f, 13.8834f, 8.1593f, 13.4973f, 8.3011f, 13.0416f)
                curveTo(8.4453f, 12.5777f, 8.8196f, 12.3658f, 9.0958f, 12.257f)
                curveTo(9.3458f, 12.1584f, 9.6716f, 12.0848f, 9.9994f, 12.0107f)
                curveTo(10.0151f, 12.0072f, 10.0307f, 12.0036f, 10.0463f, 12.0001f)
                lineTo(10.2373f, 11.9569f)
                curveTo(10.277f, 11.9479f, 10.3088f, 11.9407f, 10.3361f, 11.9343f)
                curveTo(10.3518f, 11.9068f, 10.3697f, 11.8746f, 10.3925f, 11.8337f)
                lineTo(10.4909f, 11.6573f)
                curveTo(10.4986f, 11.6435f, 10.5063f, 11.6296f, 10.514f, 11.6158f)
                curveTo(10.6837f, 11.3112f, 10.8492f, 11.0142f, 11.0135f, 10.7996f)
                close()
            }
        }
            .build()
        return _medalStarCircle!!
    }

private var _medalStarCircle: ImageVector? = null
