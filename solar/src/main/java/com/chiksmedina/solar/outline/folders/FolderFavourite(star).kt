package com.chiksmedina.solar.outline.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoldersGroup

public val FoldersGroup.`FolderFavourite(star)`: ImageVector
    get() {
        if (`_folderFavourite(star)` != null) {
            return `_folderFavourite(star)`!!
        }
        `_folderFavourite(star)` = Builder(name = "FolderFavourite(star)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.8593f, 1.25f)
                curveTo(6.889f, 1.25f, 6.9192f, 1.25f, 6.9498f, 1.25f)
                lineTo(6.9868f, 1.25f)
                curveTo(7.3382f, 1.25f, 7.5643f, 1.25f, 7.7854f, 1.2707f)
                curveTo(8.7367f, 1.3596f, 9.639f, 1.7334f, 10.3746f, 2.3431f)
                curveTo(10.5456f, 2.4848f, 10.7055f, 2.6448f, 10.954f, 2.8933f)
                lineTo(11.5303f, 3.4697f)
                curveTo(12.3761f, 4.3154f, 12.7012f, 4.6311f, 13.0768f, 4.8401f)
                curveTo(13.2948f, 4.9613f, 13.526f, 5.0571f, 13.766f, 5.1255f)
                curveTo(14.1793f, 5.2433f, 14.6324f, 5.25f, 15.8284f, 5.25f)
                lineTo(16.253f, 5.25f)
                curveTo(17.526f, 5.25f, 18.5521f, 5.25f, 19.364f, 5.3521f)
                curveTo(20.2054f, 5.4578f, 20.9204f, 5.6836f, 21.5077f, 6.2119f)
                curveTo(21.6061f, 6.3003f, 21.6997f, 6.3939f, 21.7882f, 6.4923f)
                curveTo(22.3165f, 7.0796f, 22.5422f, 7.7946f, 22.648f, 8.636f)
                curveTo(22.75f, 9.4479f, 22.75f, 10.4741f, 22.75f, 11.747f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4393f, 19.6615f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6615f, 22.4393f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4393f, 3.3896f, 22.1071f, 2.6413f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6615f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                lineTo(1.25f, 6.9498f)
                curveTo(1.25f, 6.9192f, 1.25f, 6.889f, 1.25f, 6.8593f)
                curveTo(1.2499f, 6.0634f, 1.2498f, 5.5568f, 1.3324f, 5.1193f)
                curveTo(1.6949f, 3.1979f, 3.1979f, 1.6949f, 5.1193f, 1.3324f)
                curveTo(5.5568f, 1.2498f, 6.0634f, 1.2499f, 6.8593f, 1.25f)
                close()
                moveTo(6.9498f, 2.75f)
                curveTo(6.0331f, 2.75f, 5.6787f, 2.7533f, 5.3975f, 2.8064f)
                curveTo(4.0828f, 3.0544f, 3.0544f, 4.0828f, 2.8064f, 5.3975f)
                curveTo(2.7533f, 5.6787f, 2.75f, 6.0331f, 2.75f, 6.9498f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2953f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7109f, 21.1103f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1103f)
                curveTo(19.2953f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2953f, 21.1103f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                verticalLineTo(11.7979f)
                curveTo(21.25f, 10.4621f, 21.2486f, 9.5305f, 21.1597f, 8.8231f)
                curveTo(21.0731f, 8.1345f, 20.9141f, 7.7636f, 20.6729f, 7.4954f)
                curveTo(20.6198f, 7.4364f, 20.5637f, 7.3802f, 20.5046f, 7.3271f)
                curveTo(20.2365f, 7.0859f, 19.8656f, 6.9269f, 19.1769f, 6.8403f)
                curveTo(18.4695f, 6.7514f, 17.538f, 6.75f, 16.2021f, 6.75f)
                horizontalLineTo(15.8284f)
                curveTo(15.7912f, 6.75f, 15.7545f, 6.75f, 15.7182f, 6.75f)
                curveTo(14.6702f, 6.7502f, 13.9944f, 6.7504f, 13.3548f, 6.5681f)
                curveTo(13.0041f, 6.4681f, 12.6661f, 6.3281f, 12.3475f, 6.1508f)
                curveTo(11.7663f, 5.8275f, 11.2885f, 5.3495f, 10.5476f, 4.6083f)
                curveTo(10.522f, 4.5827f, 10.496f, 4.5567f, 10.4697f, 4.5304f)
                lineTo(9.9194f, 3.9801f)
                curveTo(9.6362f, 3.6968f, 9.5278f, 3.5895f, 9.4173f, 3.4979f)
                curveTo(8.914f, 3.0807f, 8.2966f, 2.825f, 7.6458f, 2.7641f)
                curveTo(7.5029f, 2.7508f, 7.3504f, 2.75f, 6.9498f, 2.75f)
                close()
                moveTo(12.0f, 11.0345f)
                curveTo(11.9419f, 11.1352f, 11.8772f, 11.251f, 11.8011f, 11.3877f)
                lineTo(11.7027f, 11.5641f)
                curveTo(11.6958f, 11.5765f, 11.6884f, 11.5901f, 11.6804f, 11.6047f)
                curveTo(11.6019f, 11.7483f, 11.4718f, 11.9861f, 11.255f, 12.1507f)
                curveTo(11.0336f, 12.3188f, 10.7673f, 12.3766f, 10.6116f, 12.4104f)
                curveTo(10.596f, 12.4138f, 10.5815f, 12.4169f, 10.5683f, 12.4199f)
                lineTo(10.3774f, 12.4631f)
                curveTo(10.2022f, 12.5028f, 10.0595f, 12.5351f, 9.9375f, 12.5658f)
                curveTo(10.0169f, 12.6635f, 10.12f, 12.7848f, 10.254f, 12.9416f)
                lineTo(10.3842f, 13.0937f)
                curveTo(10.3934f, 13.1045f, 10.4035f, 13.1161f, 10.4142f, 13.1284f)
                curveTo(10.5221f, 13.2527f, 10.6964f, 13.4535f, 10.7769f, 13.7126f)
                curveTo(10.8566f, 13.9687f, 10.8291f, 14.2324f, 10.8118f, 14.3988f)
                curveTo(10.8101f, 14.4154f, 10.8084f, 14.4311f, 10.807f, 14.4456f)
                lineTo(10.7873f, 14.6487f)
                curveTo(10.7691f, 14.8369f, 10.7549f, 14.9872f, 10.7455f, 15.1094f)
                curveTo(10.8497f, 15.0635f, 10.9682f, 15.009f, 11.109f, 14.9441f)
                lineTo(11.2878f, 14.8618f)
                curveTo(11.3001f, 14.8561f, 11.3136f, 14.8498f, 11.3282f, 14.8429f)
                curveTo(11.4717f, 14.7752f, 11.7213f, 14.6575f, 12.0f, 14.6575f)
                curveTo(12.2787f, 14.6575f, 12.5284f, 14.7752f, 12.6719f, 14.8429f)
                curveTo(12.6865f, 14.8498f, 12.6999f, 14.8561f, 12.7122f, 14.8618f)
                lineTo(12.891f, 14.9441f)
                curveTo(13.0318f, 15.009f, 13.1504f, 15.0635f, 13.2546f, 15.1094f)
                curveTo(13.2451f, 14.9872f, 13.2309f, 14.8369f, 13.2127f, 14.6487f)
                lineTo(13.193f, 14.4456f)
                curveTo(13.1916f, 14.4311f, 13.19f, 14.4154f, 13.1883f, 14.3988f)
                curveTo(13.1709f, 14.2324f, 13.1435f, 13.9687f, 13.2231f, 13.7126f)
                curveTo(13.3037f, 13.4535f, 13.4779f, 13.2527f, 13.5859f, 13.1284f)
                curveTo(13.5966f, 13.1161f, 13.6066f, 13.1045f, 13.6158f, 13.0937f)
                lineTo(13.746f, 12.9416f)
                curveTo(13.8801f, 12.7848f, 13.9832f, 12.6635f, 14.0625f, 12.5658f)
                curveTo(13.9405f, 12.5351f, 13.7978f, 12.5028f, 13.6226f, 12.4631f)
                lineTo(13.4317f, 12.4199f)
                curveTo(13.4185f, 12.4169f, 13.404f, 12.4138f, 13.3884f, 12.4104f)
                curveTo(13.2327f, 12.3766f, 12.9664f, 12.3188f, 12.745f, 12.1507f)
                curveTo(12.5282f, 11.9861f, 12.3982f, 11.7483f, 12.3196f, 11.6047f)
                curveTo(12.3117f, 11.5901f, 12.3042f, 11.5765f, 12.2973f, 11.5641f)
                lineTo(12.199f, 11.3877f)
                curveTo(12.1228f, 11.251f, 12.0581f, 11.1352f, 12.0f, 11.0345f)
                close()
                moveTo(11.0135f, 9.7997f)
                curveTo(11.1857f, 9.5748f, 11.4983f, 9.25f, 12.0f, 9.25f)
                curveTo(12.5017f, 9.25f, 12.8144f, 9.5748f, 12.9865f, 9.7997f)
                curveTo(13.1508f, 10.0142f, 13.3163f, 10.3113f, 13.486f, 10.6158f)
                curveTo(13.4937f, 10.6296f, 13.5014f, 10.6435f, 13.5092f, 10.6574f)
                lineTo(13.6075f, 10.8337f)
                curveTo(13.6303f, 10.8746f, 13.6482f, 10.9068f, 13.6639f, 10.9343f)
                curveTo(13.6912f, 10.9407f, 13.723f, 10.9479f, 13.7628f, 10.9569f)
                lineTo(13.9537f, 11.0001f)
                curveTo(13.9693f, 11.0037f, 13.9849f, 11.0072f, 14.0006f, 11.0107f)
                curveTo(14.3284f, 11.0848f, 14.6542f, 11.1584f, 14.9043f, 11.257f)
                curveTo(15.1804f, 11.3658f, 15.5547f, 11.5777f, 15.699f, 12.0416f)
                curveTo(15.8407f, 12.4974f, 15.6618f, 12.8834f, 15.5057f, 13.1315f)
                curveTo(15.3611f, 13.3611f, 15.1414f, 13.6179f, 14.9165f, 13.8808f)
                curveTo(14.9063f, 13.8926f, 14.8962f, 13.9045f, 14.886f, 13.9164f)
                lineTo(14.7558f, 14.0686f)
                curveTo(14.7214f, 14.109f, 14.6954f, 14.1394f, 14.6735f, 14.1657f)
                curveTo(14.6765f, 14.202f, 14.6805f, 14.2443f, 14.686f, 14.3009f)
                lineTo(14.7057f, 14.504f)
                curveTo(14.7072f, 14.5195f, 14.7087f, 14.535f, 14.7102f, 14.5504f)
                curveTo(14.7444f, 14.9023f, 14.7774f, 15.2424f, 14.7653f, 15.5145f)
                curveTo(14.7526f, 15.7997f, 14.6841f, 16.2315f, 14.297f, 16.5255f)
                curveTo(13.8975f, 16.8287f, 13.4564f, 16.7626f, 13.1767f, 16.6824f)
                curveTo(12.919f, 16.6086f, 12.6144f, 16.4683f, 12.3077f, 16.3269f)
                curveTo(12.293f, 16.3202f, 12.2783f, 16.3134f, 12.2636f, 16.3066f)
                lineTo(12.0849f, 16.2243f)
                curveTo(12.0515f, 16.2089f, 12.024f, 16.1963f, 12.0f, 16.1854f)
                curveTo(11.9761f, 16.1963f, 11.9486f, 16.2089f, 11.9151f, 16.2243f)
                lineTo(11.7364f, 16.3066f)
                curveTo(11.7217f, 16.3134f, 11.707f, 16.3202f, 11.6923f, 16.3269f)
                curveTo(11.3856f, 16.4683f, 11.0811f, 16.6086f, 10.8233f, 16.6824f)
                curveTo(10.5436f, 16.7626f, 10.1025f, 16.8287f, 9.7031f, 16.5255f)
                curveTo(9.3159f, 16.2315f, 9.2474f, 15.7997f, 9.2347f, 15.5145f)
                curveTo(9.2226f, 15.2424f, 9.2556f, 14.9023f, 9.2898f, 14.5504f)
                curveTo(9.2913f, 14.535f, 9.2928f, 14.5195f, 9.2943f, 14.504f)
                lineTo(9.314f, 14.3009f)
                curveTo(9.3195f, 14.2443f, 9.3236f, 14.202f, 9.3266f, 14.1657f)
                curveTo(9.3047f, 14.1394f, 9.2787f, 14.109f, 9.2442f, 14.0686f)
                lineTo(9.114f, 13.9164f)
                curveTo(9.1039f, 13.9045f, 9.0937f, 13.8926f, 9.0835f, 13.8808f)
                curveTo(8.8586f, 13.6179f, 8.6389f, 13.3611f, 8.4944f, 13.1315f)
                curveTo(8.3382f, 12.8834f, 8.1594f, 12.4974f, 8.3011f, 12.0416f)
                curveTo(8.4453f, 11.5777f, 8.8196f, 11.3658f, 9.0958f, 11.257f)
                curveTo(9.3459f, 11.1584f, 9.6716f, 11.0848f, 9.9994f, 11.0107f)
                curveTo(10.0151f, 11.0072f, 10.0307f, 11.0037f, 10.0464f, 11.0001f)
                lineTo(10.2373f, 10.9569f)
                curveTo(10.277f, 10.9479f, 10.3088f, 10.9407f, 10.3361f, 10.9343f)
                curveTo(10.3518f, 10.9068f, 10.3698f, 10.8746f, 10.3926f, 10.8337f)
                lineTo(10.4909f, 10.6574f)
                curveTo(10.4986f, 10.6435f, 10.5063f, 10.6296f, 10.514f, 10.6158f)
                curveTo(10.6837f, 10.3113f, 10.8492f, 10.0142f, 11.0135f, 9.7997f)
                close()
            }
        }
        .build()
        return `_folderFavourite(star)`!!
    }

private var `_folderFavourite(star)`: ImageVector? = null
