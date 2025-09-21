package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(
            name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.578f, 5.3426f)
                curveTo(3.8344f, 7.0249f, 2.75f, 9.3858f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(12.1275f, 21.25f, 12.2544f, 21.2474f, 12.3807f, 21.2423f)
                curveTo(12.1752f, 20.3307f, 12.1474f, 19.1051f, 12.774f, 17.9243f)
                curveTo(13.4261f, 16.6955f, 14.7762f, 16.1622f, 15.7689f, 15.9182f)
                curveTo(16.289f, 15.7904f, 16.7708f, 15.7273f, 17.1211f, 15.6959f)
                curveTo(17.2972f, 15.6801f, 17.4423f, 15.6721f, 17.5452f, 15.668f)
                curveTo(17.5967f, 15.666f, 17.6377f, 15.6649f, 17.667f, 15.6644f)
                lineTo(17.7019f, 15.6639f)
                lineTo(17.7104f, 15.6638f)
                curveTo(19.3829f, 15.6464f, 20.1364f, 15.1025f, 20.5363f, 14.5836f)
                curveTo(20.8779f, 14.1404f, 21.0069f, 13.6971f, 21.1377f, 13.2475f)
                curveTo(21.1543f, 13.1903f, 21.171f, 13.133f, 21.1881f, 13.0756f)
                curveTo(21.229f, 12.7227f, 21.25f, 12.3638f, 21.25f, 12.0f)
                curveTo(21.25f, 9.4759f, 20.239f, 7.188f, 18.5999f, 5.519f)
                curveTo(18.5912f, 5.553f, 18.5823f, 5.5866f, 18.5732f, 5.6196f)
                curveTo(18.4104f, 6.2126f, 18.1475f, 6.8211f, 17.8618f, 7.2547f)
                curveTo(17.6059f, 7.6431f, 17.1095f, 8.0349f, 16.6975f, 8.3309f)
                curveTo(16.4263f, 8.5258f, 16.144f, 8.6913f, 15.8879f, 8.8389f)
                curveTo(15.857f, 8.8567f, 15.8265f, 8.8743f, 15.7963f, 8.8916f)
                curveTo(15.5683f, 9.0228f, 15.3631f, 9.1408f, 15.1656f, 9.2712f)
                curveTo(14.7338f, 9.5566f, 14.3997f, 9.8636f, 14.1748f, 10.3273f)
                curveTo(14.0961f, 10.4897f, 14.0936f, 10.6481f, 14.1402f, 10.8177f)
                curveTo(14.2148f, 11.0892f, 14.2656f, 11.3946f, 14.2664f, 11.706f)
                curveTo(14.2681f, 12.355f, 13.9375f, 12.8817f, 13.5126f, 13.2241f)
                curveTo(13.0928f, 13.5625f, 12.5441f, 13.756f, 11.9918f, 13.75f)
                curveTo(9.5365f, 13.7231f, 8.0269f, 11.7306f, 7.8278f, 9.5145f)
                curveTo(7.7486f, 8.6329f, 7.3621f, 7.7412f, 6.8741f, 6.9619f)
                curveTo(6.4259f, 6.2461f, 5.9209f, 5.6709f, 5.578f, 5.3426f)
                close()
                moveTo(6.745f, 4.3866f)
                curveTo(7.1601f, 4.8046f, 7.6808f, 5.4238f, 8.1454f, 6.1658f)
                curveTo(8.703f, 7.0562f, 9.2137f, 8.1776f, 9.3218f, 9.3802f)
                curveTo(9.4728f, 11.0605f, 10.5349f, 12.234f, 12.0082f, 12.25f)
                curveTo(12.2108f, 12.2523f, 12.4212f, 12.1772f, 12.5714f, 12.0562f)
                curveTo(12.7165f, 11.9393f, 12.7667f, 11.8158f, 12.7664f, 11.7099f)
                curveTo(12.766f, 11.5544f, 12.7398f, 11.3825f, 12.6937f, 11.2148f)
                curveTo(12.5726f, 10.7736f, 12.5553f, 10.2292f, 12.8252f, 9.6727f)
                curveTo(13.2102f, 8.8789f, 13.7808f, 8.3884f, 14.3388f, 8.0197f)
                curveTo(14.5779f, 7.8617f, 14.826f, 7.7192f, 15.0498f, 7.5905f)
                curveTo(15.08f, 7.5732f, 15.1097f, 7.5561f, 15.1389f, 7.5393f)
                curveTo(15.3941f, 7.3922f, 15.6182f, 7.2594f, 15.8222f, 7.1128f)
                curveTo(16.2533f, 6.8031f, 16.526f, 6.5558f, 16.6092f, 6.4295f)
                curveTo(16.7917f, 6.1526f, 16.9969f, 5.6953f, 17.1267f, 5.2225f)
                curveTo(17.2296f, 4.8479f, 17.2581f, 4.5604f, 17.2485f, 4.3822f)
                curveTo(15.7573f, 3.3528f, 13.949f, 2.75f, 12.0f, 2.75f)
                curveTo(10.0481f, 2.75f, 8.2375f, 3.3545f, 6.745f, 4.3866f)
                close()
                moveTo(22.6792f, 13.2403f)
                curveTo(22.726f, 12.8333f, 22.75f, 12.4195f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.4604f, 22.75f, 21.9699f, 18.6789f, 22.6588f, 13.4064f)
                curveTo(22.6771f, 13.3429f, 22.6929f, 13.29f, 22.7071f, 13.2501f)
                lineTo(22.6792f, 13.2403f)
                close()
                moveTo(19.9047f, 16.8066f)
                curveTo(19.3091f, 17.0249f, 18.5912f, 17.1547f, 17.7261f, 17.1638f)
                lineTo(17.7182f, 17.1638f)
                verticalLineTo(17.1638f)
                lineTo(17.7156f, 17.1638f)
                lineTo(17.695f, 17.1641f)
                curveTo(17.6755f, 17.1645f, 17.6449f, 17.1652f, 17.6044f, 17.1668f)
                curveTo(17.5233f, 17.1701f, 17.4034f, 17.1766f, 17.2552f, 17.1899f)
                curveTo(16.9571f, 17.2166f, 16.5537f, 17.27f, 16.1269f, 17.3749f)
                curveTo(15.2257f, 17.5964f, 14.435f, 17.9942f, 14.099f, 18.6274f)
                curveTo(13.6435f, 19.4857f, 13.7085f, 20.4196f, 13.8784f, 21.0592f)
                curveTo(16.4274f, 20.5334f, 18.5931f, 18.9589f, 19.9047f, 16.8066f)
                close()
            }
        }
            .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
