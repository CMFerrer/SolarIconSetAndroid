package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.Bacteria: ImageVector
    get() {
        if (_bacteria != null) {
            return _bacteria!!
        }
        _bacteria = Builder(
            name = "Bacteria", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(7.3432f, 12.0f, 6.0f, 13.3431f, 6.0f, 15.0f)
                curveTo(6.0f, 16.6569f, 7.3432f, 18.0f, 9.0f, 18.0f)
                curveTo(10.6569f, 18.0f, 12.0f, 16.6569f, 12.0f, 15.0f)
                curveTo(12.0f, 13.3431f, 10.6569f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(5.201f, 9.807f)
                curveTo(5.5837f, 9.9655f, 5.7655f, 10.4042f, 5.607f, 10.7869f)
                lineTo(5.1929f, 11.7869f)
                curveTo(5.0345f, 12.1696f, 4.5958f, 12.3514f, 4.2131f, 12.1929f)
                curveTo(3.8304f, 12.0345f, 3.6486f, 11.5958f, 3.807f, 11.2131f)
                lineTo(4.2211f, 10.2131f)
                curveTo(4.3796f, 9.8304f, 4.8183f, 9.6486f, 5.201f, 9.807f)
                close()
                moveTo(13.7219f, 7.2739f)
                curveTo(13.7782f, 7.6824f, 14.1536f, 7.9684f, 14.5618f, 7.9152f)
                curveTo(15.2243f, 7.8788f, 16.5495f, 8.2254f, 16.5495f, 9.903f)
                curveTo(16.4963f, 10.3112f, 16.7823f, 10.6865f, 17.1908f, 10.7429f)
                curveTo(17.6011f, 10.7994f, 17.9837f, 10.4793f, 18.0403f, 10.069f)
                curveTo(18.0421f, 10.053f, 18.0442f, 10.0322f, 18.0463f, 10.007f)
                curveTo(18.0505f, 9.9566f, 18.0547f, 9.8883f, 18.0562f, 9.8055f)
                curveTo(18.0591f, 9.6406f, 18.0515f, 9.4128f, 18.0098f, 9.1507f)
                curveTo(17.927f, 8.6307f, 17.7023f, 7.9341f, 17.1165f, 7.3482f)
                curveTo(16.5306f, 6.7624f, 15.834f, 6.5377f, 15.314f, 6.4549f)
                curveTo(15.0519f, 6.4132f, 14.8242f, 6.4056f, 14.6593f, 6.4085f)
                curveTo(14.5764f, 6.41f, 14.5081f, 6.4142f, 14.4577f, 6.4184f)
                curveTo(14.4325f, 6.4205f, 14.3679f, 6.4278f, 14.3679f, 6.4278f)
                curveTo(13.9576f, 6.4843f, 13.6653f, 6.8636f, 13.7219f, 7.2739f)
                close()
                moveTo(9.7431f, 9.1904f)
                curveTo(9.7997f, 9.6007f, 9.5129f, 9.9792f, 9.1026f, 10.0358f)
                lineTo(9.1014f, 10.036f)
                lineTo(9.1001f, 10.0362f)
                lineTo(9.097f, 10.0366f)
                lineTo(9.0896f, 10.0375f)
                lineTo(9.0692f, 10.0399f)
                curveTo(9.0532f, 10.0417f, 9.0324f, 10.0438f, 9.0072f, 10.0459f)
                curveTo(8.9569f, 10.0501f, 8.8886f, 10.0543f, 8.8057f, 10.0558f)
                curveTo(8.6408f, 10.0588f, 8.413f, 10.0511f, 8.151f, 10.0094f)
                curveTo(7.631f, 9.9266f, 6.9343f, 9.7019f, 6.3485f, 9.1161f)
                curveTo(5.7627f, 8.5303f, 5.538f, 7.8336f, 5.4552f, 7.3136f)
                curveTo(5.4134f, 7.0515f, 5.4058f, 6.8238f, 5.4088f, 6.6589f)
                curveTo(5.4103f, 6.576f, 5.4145f, 6.5077f, 5.4186f, 6.4574f)
                curveTo(5.4207f, 6.4322f, 5.4228f, 6.4113f, 5.4246f, 6.3953f)
                lineTo(5.427f, 6.3749f)
                lineTo(5.428f, 6.3675f)
                curveTo(5.4846f, 5.9572f, 5.8638f, 5.6649f, 6.2742f, 5.7215f)
                curveTo(6.6827f, 5.7778f, 6.9687f, 6.1532f, 6.9154f, 6.5614f)
                curveTo(6.8791f, 7.224f, 7.2258f, 8.5492f, 8.9032f, 8.5492f)
                curveTo(9.3114f, 8.4959f, 9.6868f, 8.7819f, 9.7431f, 9.1904f)
                close()
                moveTo(19.7363f, 12.9927f)
                curveTo(19.8144f, 13.394f, 19.5569f, 13.7828f, 19.1593f, 13.869f)
                lineTo(19.1567f, 13.8698f)
                curveTo(19.1478f, 13.8723f, 19.1274f, 13.8785f, 19.0983f, 13.89f)
                curveTo(19.0397f, 13.913f, 18.9494f, 13.956f, 18.8481f, 14.0302f)
                curveTo(18.6557f, 14.1711f, 18.3898f, 14.4479f, 18.241f, 15.0032f)
                curveTo(18.0922f, 15.5586f, 18.184f, 15.9314f, 18.2802f, 16.1495f)
                curveTo(18.3309f, 16.2644f, 18.3876f, 16.3468f, 18.4268f, 16.3961f)
                curveTo(18.4463f, 16.4206f, 18.4609f, 16.4362f, 18.4672f, 16.4428f)
                lineTo(18.4692f, 16.4447f)
                curveTo(18.7704f, 16.7182f, 18.799f, 17.1837f, 18.5306f, 17.4921f)
                curveTo(18.2587f, 17.8046f, 17.785f, 17.8375f, 17.4725f, 17.5656f)
                lineTo(17.9647f, 17.0f)
                curveTo(17.4725f, 17.5656f, 17.4729f, 17.5659f, 17.4725f, 17.5656f)
                lineTo(17.4711f, 17.5644f)
                lineTo(17.4697f, 17.5631f)
                lineTo(17.4665f, 17.5603f)
                lineTo(17.4592f, 17.5538f)
                lineTo(17.441f, 17.537f)
                curveTo(17.4274f, 17.5242f, 17.4108f, 17.508f, 17.3918f, 17.4884f)
                curveTo(17.3538f, 17.4493f, 17.3058f, 17.3965f, 17.2527f, 17.3297f)
                curveTo(17.1467f, 17.1963f, 17.018f, 17.0049f, 16.9077f, 16.7546f)
                curveTo(16.6819f, 16.2425f, 16.5497f, 15.5199f, 16.7921f, 14.6151f)
                curveTo(17.0345f, 13.7102f, 17.5104f, 13.1505f, 17.962f, 12.8199f)
                curveTo(18.1827f, 12.6583f, 18.3899f, 12.5569f, 18.5483f, 12.4944f)
                curveTo(18.6277f, 12.4631f, 18.6957f, 12.4413f, 18.7481f, 12.4265f)
                curveTo(18.7744f, 12.419f, 18.7969f, 12.4133f, 18.8151f, 12.409f)
                lineTo(18.8392f, 12.4036f)
                lineTo(18.8488f, 12.4015f)
                lineTo(18.853f, 12.4007f)
                lineTo(18.8549f, 12.4003f)
                curveTo(18.8553f, 12.4002f, 18.8567f, 12.4f, 19.0001f, 13.1361f)
                lineTo(18.8567f, 12.4f)
                curveTo(19.2633f, 12.3208f, 19.6571f, 12.5862f, 19.7363f, 12.9927f)
                close()
                moveTo(12.8289f, 17.3115f)
                curveTo(13.0832f, 16.9845f, 13.5545f, 16.9257f, 13.8814f, 17.18f)
                lineTo(15.46f, 18.408f)
                curveTo(15.787f, 18.6623f, 15.8458f, 19.1335f, 15.5915f, 19.4605f)
                curveTo(15.3372f, 19.7874f, 14.866f, 19.8463f, 14.539f, 19.5919f)
                lineTo(12.9604f, 18.364f)
                curveTo(12.6335f, 18.1096f, 12.5746f, 17.6384f, 12.8289f, 17.3115f)
                close()
                moveTo(15.25f, 12.0f)
                curveTo(15.25f, 11.5858f, 14.9142f, 11.25f, 14.5f, 11.25f)
                curveTo(14.0858f, 11.25f, 13.75f, 11.5858f, 13.75f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(13.75f, 14.4142f, 14.0858f, 14.75f, 14.5f, 14.75f)
                curveTo(14.9142f, 14.75f, 15.25f, 14.4142f, 15.25f, 14.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(10.0f, 4.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 4.25f, 12.75f, 4.5858f, 12.75f, 5.0f)
                curveTo(12.75f, 5.4142f, 12.4142f, 5.75f, 12.0f, 5.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 5.75f, 9.25f, 5.4142f, 9.25f, 5.0f)
                curveTo(9.25f, 4.5858f, 9.5858f, 4.25f, 10.0f, 4.25f)
                close()
                moveTo(12.0303f, 7.9697f)
                curveTo(11.7374f, 7.6768f, 11.2626f, 7.6768f, 10.9697f, 7.9697f)
                curveTo(10.6768f, 8.2626f, 10.6768f, 8.7374f, 10.9697f, 9.0303f)
                lineTo(11.9697f, 10.0303f)
                curveTo(12.2626f, 10.3232f, 12.7374f, 10.3232f, 13.0303f, 10.0303f)
                curveTo(13.3232f, 9.7374f, 13.3232f, 9.2626f, 13.0303f, 8.9697f)
                lineTo(12.0303f, 7.9697f)
                close()
            }
        }
            .build()
        return _bacteria!!
    }

private var _bacteria: ImageVector? = null
