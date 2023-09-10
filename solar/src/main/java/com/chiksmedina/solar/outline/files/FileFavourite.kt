package com.chiksmedina.solar.outline.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FilesGroup

val FilesGroup.FileFavourite: ImageVector
    get() {
        if (_fileFavourite != null) {
            return _fileFavourite!!
        }
        _fileFavourite = Builder(
            name = "FileFavourite", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.25f, 2.8342f)
                curveTo(11.7896f, 2.756f, 11.162f, 2.7501f, 10.0298f, 2.7501f)
                curveTo(8.1131f, 2.7501f, 6.7508f, 2.7516f, 5.7179f, 2.8899f)
                curveTo(4.706f, 3.0253f, 4.1245f, 3.2793f, 3.7019f, 3.702f)
                curveTo(3.2787f, 4.1252f, 3.025f, 4.7048f, 2.8898f, 5.7109f)
                curveTo(2.7516f, 6.7386f, 2.75f, 8.0932f, 2.75f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(2.75f, 15.9069f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2953f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7214f, 4.7048f, 20.975f, 5.7108f, 21.1103f)
                curveTo(6.7385f, 21.2485f, 8.0932f, 21.2501f, 10.0f, 21.2501f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.2501f, 17.2615f, 21.2485f, 18.2892f, 21.1103f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7214f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2953f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9069f, 21.25f, 14.0001f)
                verticalLineTo(13.5629f)
                curveTo(21.25f, 12.0269f, 21.2392f, 11.2988f, 21.0762f, 10.7501f)
                horizontalLineTo(17.9463f)
                curveTo(16.8135f, 10.7501f, 15.8877f, 10.7501f, 15.1569f, 10.6518f)
                curveTo(14.3929f, 10.5491f, 13.7306f, 10.3268f, 13.2019f, 9.7982f)
                curveTo(12.6732f, 9.2695f, 12.4509f, 8.6071f, 12.3482f, 7.8432f)
                curveTo(12.25f, 7.1123f, 12.25f, 6.1866f, 12.25f, 5.0537f)
                verticalLineTo(2.8342f)
                close()
                moveTo(13.75f, 3.6095f)
                verticalLineTo(5.0001f)
                curveTo(13.75f, 6.1998f, 13.7516f, 7.0241f, 13.8348f, 7.6433f)
                curveTo(13.9152f, 8.2409f, 14.059f, 8.5339f, 14.2626f, 8.7375f)
                curveTo(14.4661f, 8.941f, 14.7591f, 9.0849f, 15.3568f, 9.1652f)
                curveTo(15.976f, 9.2485f, 16.8003f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(20.0195f)
                curveTo(19.723f, 8.9625f, 19.3432f, 8.618f, 18.85f, 8.1741f)
                lineTo(14.8912f, 4.6112f)
                curveTo(14.4058f, 4.1743f, 14.0446f, 3.8519f, 13.75f, 3.6095f)
                close()
                moveTo(10.1755f, 1.25f)
                curveTo(11.5601f, 1.2497f, 12.4546f, 1.2494f, 13.2779f, 1.5654f)
                curveTo(14.1012f, 1.8813f, 14.7632f, 2.4773f, 15.7873f, 3.3995f)
                curveTo(15.8226f, 3.4314f, 15.8584f, 3.4636f, 15.8947f, 3.4962f)
                lineTo(19.8534f, 7.0591f)
                curveTo(19.8956f, 7.0971f, 19.9372f, 7.1345f, 19.9783f, 7.1715f)
                curveTo(21.162f, 8.2361f, 21.9274f, 8.9246f, 22.3391f, 9.849f)
                curveTo(22.7508f, 10.7734f, 22.7505f, 11.8029f, 22.75f, 13.3949f)
                curveTo(22.75f, 13.4502f, 22.75f, 13.5062f, 22.75f, 13.5629f)
                verticalLineTo(14.0565f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3499f, 22.5969f, 18.4891f)
                curveTo(22.4392f, 19.6615f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1072f, 19.6614f, 22.4393f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.7501f, 15.8942f, 22.7501f, 14.0564f, 22.7501f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.7501f, 6.6502f, 22.7501f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4393f, 3.3896f, 22.1072f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6615f, 1.4031f, 18.4891f)
                curveTo(1.25f, 17.3499f, 1.25f, 15.8942f, 1.25f, 14.0565f)
                verticalLineTo(9.9436f)
                curveTo(1.25f, 8.1059f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3897f, 2.6412f, 2.6413f)
                curveTo(3.3902f, 1.8923f, 4.3423f, 1.5606f, 5.5189f, 1.4031f)
                curveTo(6.6628f, 1.25f, 8.1257f, 1.25f, 9.9735f, 1.25f)
                lineTo(10.0298f, 1.25f)
                curveTo(10.0789f, 1.25f, 10.1275f, 1.25f, 10.1755f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 13.0345f)
                curveTo(8.9419f, 13.1352f, 8.8772f, 13.2511f, 8.801f, 13.3877f)
                lineTo(8.7027f, 13.5641f)
                curveTo(8.6958f, 13.5765f, 8.6884f, 13.5901f, 8.6804f, 13.6047f)
                curveTo(8.6019f, 13.7483f, 8.4718f, 13.9861f, 8.255f, 14.1508f)
                curveTo(8.0336f, 14.3188f, 7.7673f, 14.3766f, 7.6116f, 14.4104f)
                curveTo(7.596f, 14.4138f, 7.5815f, 14.417f, 7.5683f, 14.42f)
                lineTo(7.3774f, 14.4632f)
                curveTo(7.2022f, 14.5028f, 7.0595f, 14.5351f, 6.9375f, 14.5658f)
                curveTo(7.0169f, 14.6635f, 7.1199f, 14.7848f, 7.254f, 14.9416f)
                lineTo(7.3842f, 15.0938f)
                curveTo(7.3934f, 15.1046f, 7.4035f, 15.1161f, 7.4141f, 15.1285f)
                curveTo(7.5221f, 15.2528f, 7.6963f, 15.4535f, 7.7769f, 15.7127f)
                curveTo(7.8566f, 15.9687f, 7.8291f, 16.2325f, 7.8118f, 16.3989f)
                curveTo(7.81f, 16.4155f, 7.8084f, 16.4311f, 7.807f, 16.4457f)
                lineTo(7.7873f, 16.6487f)
                curveTo(7.7691f, 16.837f, 7.7549f, 16.9872f, 7.7455f, 17.1094f)
                curveTo(7.8497f, 17.0635f, 7.9682f, 17.009f, 8.109f, 16.9441f)
                lineTo(8.2878f, 16.8618f)
                curveTo(8.3001f, 16.8562f, 8.3136f, 16.8498f, 8.3281f, 16.8429f)
                curveTo(8.4716f, 16.7753f, 8.7213f, 16.6575f, 9.0f, 16.6575f)
                curveTo(9.2787f, 16.6575f, 9.5284f, 16.7753f, 9.6719f, 16.8429f)
                curveTo(9.6864f, 16.8498f, 9.6999f, 16.8562f, 9.7122f, 16.8618f)
                lineTo(9.891f, 16.9441f)
                curveTo(10.0318f, 17.009f, 10.1503f, 17.0635f, 10.2545f, 17.1094f)
                curveTo(10.2451f, 16.9872f, 10.2309f, 16.837f, 10.2127f, 16.6487f)
                lineTo(10.193f, 16.4457f)
                curveTo(10.1916f, 16.4311f, 10.19f, 16.4155f, 10.1882f, 16.3989f)
                curveTo(10.1709f, 16.2325f, 10.1434f, 15.9687f, 10.2231f, 15.7127f)
                curveTo(10.3037f, 15.4535f, 10.4779f, 15.2528f, 10.5859f, 15.1285f)
                curveTo(10.5965f, 15.1161f, 10.6066f, 15.1046f, 10.6158f, 15.0938f)
                lineTo(10.746f, 14.9416f)
                curveTo(10.8801f, 14.7848f, 10.9831f, 14.6635f, 11.0625f, 14.5658f)
                curveTo(10.9405f, 14.5351f, 10.7978f, 14.5028f, 10.6226f, 14.4632f)
                lineTo(10.4317f, 14.42f)
                curveTo(10.4185f, 14.417f, 10.404f, 14.4138f, 10.3884f, 14.4104f)
                curveTo(10.2327f, 14.3766f, 9.9664f, 14.3188f, 9.745f, 14.1508f)
                curveTo(9.5282f, 13.9861f, 9.3981f, 13.7483f, 9.3196f, 13.6047f)
                curveTo(9.3116f, 13.5901f, 9.3042f, 13.5765f, 9.2973f, 13.5641f)
                lineTo(9.199f, 13.3877f)
                curveTo(9.1228f, 13.2511f, 9.0581f, 13.1352f, 9.0f, 13.0345f)
                close()
                moveTo(8.0135f, 11.7997f)
                curveTo(8.1857f, 11.5749f, 8.4983f, 11.2501f, 9.0f, 11.2501f)
                curveTo(9.5017f, 11.2501f, 9.8143f, 11.5749f, 9.9865f, 11.7997f)
                curveTo(10.1508f, 12.0143f, 10.3163f, 12.3113f, 10.486f, 12.6158f)
                curveTo(10.4937f, 12.6297f, 10.5014f, 12.6435f, 10.5091f, 12.6574f)
                lineTo(10.6075f, 12.8337f)
                curveTo(10.6303f, 12.8746f, 10.6482f, 12.9068f, 10.6639f, 12.9343f)
                curveTo(10.6912f, 12.9408f, 10.723f, 12.948f, 10.7627f, 12.957f)
                lineTo(10.9536f, 13.0001f)
                curveTo(10.9693f, 13.0037f, 10.9849f, 13.0072f, 11.0006f, 13.0108f)
                curveTo(11.3284f, 13.0848f, 11.6542f, 13.1584f, 11.9042f, 13.257f)
                curveTo(12.1804f, 13.3658f, 12.5547f, 13.5778f, 12.6989f, 14.0417f)
                curveTo(12.8407f, 14.4974f, 12.6618f, 14.8834f, 12.5056f, 15.1315f)
                curveTo(12.3611f, 15.3611f, 12.1414f, 15.6179f, 11.9165f, 15.8808f)
                curveTo(11.9063f, 15.8927f, 11.8961f, 15.9046f, 11.886f, 15.9165f)
                lineTo(11.7558f, 16.0687f)
                curveTo(11.7213f, 16.109f, 11.6953f, 16.1394f, 11.6735f, 16.1657f)
                curveTo(11.6764f, 16.202f, 11.6805f, 16.2444f, 11.686f, 16.301f)
                lineTo(11.7057f, 16.504f)
                curveTo(11.7072f, 16.5195f, 11.7087f, 16.535f, 11.7102f, 16.5504f)
                curveTo(11.7444f, 16.9024f, 11.7774f, 17.2425f, 11.7653f, 17.5145f)
                curveTo(11.7526f, 17.7998f, 11.6841f, 18.2316f, 11.2969f, 18.5255f)
                curveTo(10.8975f, 18.8287f, 10.4564f, 18.7626f, 10.1767f, 18.6825f)
                curveTo(9.919f, 18.6086f, 9.6144f, 18.4683f, 9.3077f, 18.327f)
                curveTo(9.293f, 18.3202f, 9.2783f, 18.3134f, 9.2636f, 18.3067f)
                lineTo(9.0849f, 18.2244f)
                curveTo(9.0514f, 18.209f, 9.0239f, 18.1963f, 9.0f, 18.1855f)
                curveTo(8.9761f, 18.1963f, 8.9486f, 18.209f, 8.9151f, 18.2244f)
                lineTo(8.7364f, 18.3067f)
                curveTo(8.7217f, 18.3134f, 8.707f, 18.3202f, 8.6923f, 18.327f)
                curveTo(8.3856f, 18.4683f, 8.081f, 18.6086f, 7.8233f, 18.6825f)
                curveTo(7.5436f, 18.7626f, 7.1025f, 18.8287f, 6.7031f, 18.5255f)
                curveTo(6.3159f, 18.2316f, 6.2474f, 17.7998f, 6.2347f, 17.5145f)
                curveTo(6.2226f, 17.2425f, 6.2556f, 16.9024f, 6.2898f, 16.5504f)
                curveTo(6.2913f, 16.535f, 6.2928f, 16.5195f, 6.2943f, 16.504f)
                lineTo(6.314f, 16.301f)
                curveTo(6.3195f, 16.2444f, 6.3236f, 16.202f, 6.3266f, 16.1657f)
                curveTo(6.3046f, 16.1394f, 6.2787f, 16.109f, 6.2442f, 16.0687f)
                lineTo(6.114f, 15.9165f)
                curveTo(6.1038f, 15.9046f, 6.0937f, 15.8927f, 6.0835f, 15.8808f)
                curveTo(5.8586f, 15.6179f, 5.6389f, 15.3611f, 5.4944f, 15.1315f)
                curveTo(5.3382f, 14.8834f, 5.1593f, 14.4974f, 5.3011f, 14.0417f)
                curveTo(5.4453f, 13.5778f, 5.8196f, 13.3658f, 6.0958f, 13.257f)
                curveTo(6.3458f, 13.1584f, 6.6716f, 13.0848f, 6.9994f, 13.0108f)
                curveTo(7.0151f, 13.0072f, 7.0307f, 13.0037f, 7.0464f, 13.0001f)
                lineTo(7.2373f, 12.957f)
                curveTo(7.277f, 12.948f, 7.3088f, 12.9408f, 7.3361f, 12.9343f)
                curveTo(7.3518f, 12.9068f, 7.3698f, 12.8746f, 7.3925f, 12.8337f)
                lineTo(7.4909f, 12.6574f)
                curveTo(7.4986f, 12.6435f, 7.5063f, 12.6297f, 7.514f, 12.6158f)
                curveTo(7.6837f, 12.3113f, 7.8492f, 12.0143f, 8.0135f, 11.7997f)
                close()
            }
        }
            .build()
        return _fileFavourite!!
    }

private var _fileFavourite: ImageVector? = null
