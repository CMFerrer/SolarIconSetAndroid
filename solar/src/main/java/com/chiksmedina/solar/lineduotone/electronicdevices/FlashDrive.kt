package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.FlashDrive: ImageVector
    get() {
        if (_flashDrive != null) {
            return _flashDrive!!
        }
        _flashDrive = Builder(name = "FlashDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4603f, 18.7455f)
                lineTo(14.9906f, 19.2758f)
                lineTo(14.9906f, 19.2758f)
                lineTo(14.4603f, 18.7455f)
                close()
                moveTo(15.2274f, 17.9783f)
                lineTo(14.6971f, 17.448f)
                lineTo(14.6971f, 17.448f)
                lineTo(15.2274f, 17.9783f)
                close()
                moveTo(18.4821f, 13.3755f)
                lineTo(19.2321f, 13.3755f)
                lineTo(18.4821f, 13.3755f)
                close()
                moveTo(6.0218f, 8.7727f)
                lineTo(6.5521f, 9.3031f)
                lineTo(6.5521f, 9.3031f)
                lineTo(6.0218f, 8.7727f)
                close()
                moveTo(10.6246f, 5.5181f)
                lineTo(10.6246f, 6.2681f)
                lineTo(10.6246f, 5.5181f)
                close()
                moveTo(5.2547f, 9.5399f)
                lineTo(4.7243f, 9.0095f)
                lineTo(4.7243f, 9.0095f)
                lineTo(5.2547f, 9.5399f)
                close()
                moveTo(2.0f, 14.1427f)
                lineTo(1.25f, 14.1427f)
                lineTo(2.0f, 14.1427f)
                close()
                moveTo(5.785f, 10.0702f)
                lineTo(6.5521f, 9.3031f)
                lineTo(5.4915f, 8.2424f)
                lineTo(4.7243f, 9.0095f)
                lineTo(5.785f, 10.0702f)
                close()
                moveTo(14.6971f, 17.448f)
                lineTo(13.9299f, 18.2152f)
                lineTo(14.9906f, 19.2758f)
                lineTo(15.7577f, 18.5087f)
                lineTo(14.6971f, 17.448f)
                close()
                moveTo(13.9299f, 18.2152f)
                curveTo(12.8301f, 19.315f, 12.0574f, 20.0855f, 11.3958f, 20.5902f)
                curveTo(10.7516f, 21.0818f, 10.3016f, 21.2502f, 9.8575f, 21.2502f)
                lineTo(9.8575f, 22.7502f)
                curveTo(10.7615f, 22.7502f, 11.528f, 22.3761f, 12.3057f, 21.7828f)
                curveTo(13.0661f, 21.2026f, 13.9207f, 20.3457f, 14.9906f, 19.2758f)
                lineTo(13.9299f, 18.2152f)
                close()
                moveTo(4.7243f, 19.2758f)
                curveTo(5.7942f, 20.3457f, 6.6489f, 21.2026f, 7.4093f, 21.7828f)
                curveTo(8.1869f, 22.3761f, 8.9535f, 22.7502f, 9.8575f, 22.7502f)
                lineTo(9.8575f, 21.2502f)
                curveTo(9.4133f, 21.2502f, 8.9634f, 21.0818f, 8.3191f, 20.5902f)
                curveTo(7.6576f, 20.0855f, 6.8849f, 19.315f, 5.785f, 18.2152f)
                lineTo(4.7243f, 19.2758f)
                close()
                moveTo(14.6971f, 9.3031f)
                curveTo(15.797f, 10.403f, 16.5674f, 11.1756f, 17.0722f, 11.8372f)
                curveTo(17.5637f, 12.4814f, 17.7321f, 12.9314f, 17.7321f, 13.3755f)
                lineTo(19.2321f, 13.3755f)
                curveTo(19.2321f, 12.4716f, 18.858f, 11.705f, 18.2647f, 10.9273f)
                curveTo(17.6845f, 10.167f, 16.8276f, 9.3123f, 15.7577f, 8.2424f)
                lineTo(14.6971f, 9.3031f)
                close()
                moveTo(15.7577f, 18.5087f)
                curveTo(16.8276f, 17.4388f, 17.6845f, 16.5841f, 18.2647f, 15.8238f)
                curveTo(18.858f, 15.0461f, 19.2321f, 14.2795f, 19.2321f, 13.3755f)
                lineTo(17.7321f, 13.3755f)
                curveTo(17.7321f, 13.8197f, 17.5637f, 14.2696f, 17.0722f, 14.9139f)
                curveTo(16.5674f, 15.5754f, 15.797f, 16.3481f, 14.6971f, 17.448f)
                lineTo(15.7577f, 18.5087f)
                close()
                moveTo(6.5521f, 9.3031f)
                curveTo(7.652f, 8.2032f, 8.4247f, 7.4328f, 9.0863f, 6.928f)
                curveTo(9.7305f, 6.4365f, 10.1805f, 6.2681f, 10.6246f, 6.2681f)
                lineTo(10.6246f, 4.7681f)
                curveTo(9.7206f, 4.7681f, 8.9541f, 5.1421f, 8.1764f, 5.7355f)
                curveTo(7.416f, 6.3156f, 6.5614f, 7.1725f, 5.4915f, 8.2424f)
                lineTo(6.5521f, 9.3031f)
                close()
                moveTo(15.7577f, 8.2424f)
                curveTo(14.6878f, 7.1725f, 13.8332f, 6.3156f, 13.0728f, 5.7355f)
                curveTo(12.2952f, 5.1421f, 11.5286f, 4.7681f, 10.6246f, 4.7681f)
                lineTo(10.6246f, 6.2681f)
                curveTo(11.0688f, 6.2681f, 11.5187f, 6.4365f, 12.163f, 6.928f)
                curveTo(12.8245f, 7.4328f, 13.5972f, 8.2032f, 14.6971f, 9.3031f)
                lineTo(15.7577f, 8.2424f)
                close()
                moveTo(4.7243f, 9.0095f)
                curveTo(3.6544f, 10.0794f, 2.7975f, 10.9341f, 2.2174f, 11.6945f)
                curveTo(1.6241f, 12.4721f, 1.25f, 13.2387f, 1.25f, 14.1427f)
                lineTo(2.75f, 14.1427f)
                curveTo(2.75f, 13.6985f, 2.9184f, 13.2486f, 3.4099f, 12.6043f)
                curveTo(3.9147f, 11.9428f, 4.6851f, 11.1701f, 5.785f, 10.0702f)
                lineTo(4.7243f, 9.0095f)
                close()
                moveTo(5.785f, 18.2152f)
                curveTo(4.6851f, 17.1153f, 3.9147f, 16.3426f, 3.4099f, 15.681f)
                curveTo(2.9184f, 15.0368f, 2.75f, 14.5868f, 2.75f, 14.1427f)
                lineTo(1.25f, 14.1427f)
                curveTo(1.25f, 15.0467f, 1.6241f, 15.8132f, 2.2174f, 16.5909f)
                curveTo(2.7975f, 17.3513f, 3.6544f, 18.2059f, 4.7243f, 19.2758f)
                lineTo(5.785f, 18.2152f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.785f, 13.6122f)
                curveTo(5.4921f, 13.3194f, 5.0172f, 13.3194f, 4.7243f, 13.6122f)
                curveTo(4.4314f, 13.9051f, 4.4314f, 14.38f, 4.7243f, 14.6729f)
                lineTo(5.785f, 13.6122f)
                close()
                moveTo(9.3271f, 19.2757f)
                curveTo(9.62f, 19.5686f, 10.0949f, 19.5686f, 10.3878f, 19.2757f)
                curveTo(10.6807f, 18.9828f, 10.6807f, 18.5079f, 10.3878f, 18.2151f)
                lineTo(9.3271f, 19.2757f)
                close()
                moveTo(4.7243f, 14.6729f)
                lineTo(9.3271f, 19.2757f)
                lineTo(10.3878f, 18.2151f)
                lineTo(5.785f, 13.6122f)
                lineTo(4.7243f, 14.6729f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8301f, 10.441f)
                lineTo(20.3646f, 10.967f)
                lineTo(20.3646f, 10.967f)
                lineTo(19.8301f, 10.441f)
                close()
                moveTo(17.7613f, 11.4739f)
                curveTo(17.4707f, 11.7692f, 17.4745f, 12.244f, 17.7697f, 12.5346f)
                curveTo(18.065f, 12.8251f, 18.5398f, 12.8213f, 18.8304f, 12.5261f)
                lineTo(17.7613f, 11.4739f)
                close()
                moveTo(19.8301f, 4.2048f)
                lineTo(19.2955f, 4.7309f)
                lineTo(19.2955f, 4.7309f)
                lineTo(19.8301f, 4.2048f)
                close()
                moveTo(21.9999f, 7.3229f)
                lineTo(22.7499f, 7.3229f)
                verticalLineTo(7.3229f)
                lineTo(21.9999f, 7.3229f)
                close()
                moveTo(13.693f, 4.2048f)
                lineTo(14.2276f, 4.7309f)
                lineTo(14.2276f, 4.7309f)
                lineTo(13.693f, 4.2048f)
                close()
                moveTo(16.7615f, 2.0f)
                lineTo(16.7615f, 2.75f)
                lineTo(16.7615f, 2.75f)
                lineTo(16.7615f, 2.0f)
                close()
                moveTo(11.4653f, 5.3992f)
                curveTo(11.1748f, 5.6944f, 11.1786f, 6.1693f, 11.4738f, 6.4598f)
                curveTo(11.769f, 6.7504f, 12.2439f, 6.7466f, 12.5344f, 6.4513f)
                lineTo(11.4653f, 5.3992f)
                close()
                moveTo(19.2955f, 9.9149f)
                lineTo(17.7613f, 11.4739f)
                lineTo(18.8304f, 12.5261f)
                lineTo(20.3646f, 10.967f)
                lineTo(19.2955f, 9.9149f)
                close()
                moveTo(19.2955f, 4.7309f)
                curveTo(20.0336f, 5.4808f, 20.5333f, 5.9908f, 20.8577f, 6.4229f)
                curveTo(21.1687f, 6.8372f, 21.2499f, 7.0925f, 21.2499f, 7.3229f)
                lineTo(22.7499f, 7.3229f)
                curveTo(22.7499f, 6.64f, 22.4694f, 6.0712f, 22.0572f, 5.5223f)
                curveTo(21.6583f, 4.991f, 21.0731f, 4.3987f, 20.3646f, 3.6787f)
                lineTo(19.2955f, 4.7309f)
                close()
                moveTo(20.3646f, 10.967f)
                curveTo(21.0731f, 10.2471f, 21.6583f, 9.6547f, 22.0572f, 9.1235f)
                curveTo(22.4694f, 8.5745f, 22.7499f, 8.0058f, 22.7499f, 7.3229f)
                lineTo(21.2499f, 7.3229f)
                curveTo(21.2499f, 7.5533f, 21.1687f, 7.8086f, 20.8577f, 8.2229f)
                curveTo(20.5333f, 8.6549f, 20.0336f, 9.1649f, 19.2955f, 9.9149f)
                lineTo(20.3646f, 10.967f)
                close()
                moveTo(14.2276f, 4.7309f)
                curveTo(14.9658f, 3.9808f, 15.4675f, 3.4732f, 15.8922f, 3.1439f)
                curveTo(16.3002f, 2.8277f, 16.5458f, 2.75f, 16.7615f, 2.75f)
                lineTo(16.7615f, 1.25f)
                curveTo(16.0785f, 1.25f, 15.5131f, 1.5398f, 14.9731f, 1.9585f)
                curveTo(14.4499f, 2.3641f, 13.8667f, 2.959f, 13.1584f, 3.6787f)
                lineTo(14.2276f, 4.7309f)
                close()
                moveTo(20.3646f, 3.6787f)
                curveTo(19.6563f, 2.959f, 19.0731f, 2.3641f, 18.5499f, 1.9585f)
                curveTo(18.0099f, 1.5398f, 17.4446f, 1.25f, 16.7615f, 1.25f)
                lineTo(16.7615f, 2.75f)
                curveTo(16.9773f, 2.75f, 17.2229f, 2.8277f, 17.6309f, 3.1439f)
                curveTo(18.0556f, 3.4732f, 18.5573f, 3.9808f, 19.2955f, 4.7309f)
                lineTo(20.3646f, 3.6787f)
                close()
                moveTo(13.1584f, 3.6787f)
                lineTo(11.4653f, 5.3992f)
                lineTo(12.5344f, 6.4513f)
                lineTo(14.2276f, 4.7309f)
                lineTo(13.1584f, 3.6787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4603f, 18.7455f)
                lineTo(14.9906f, 19.2758f)
                lineTo(14.9906f, 19.2758f)
                lineTo(14.4603f, 18.7455f)
                close()
                moveTo(15.2274f, 17.9783f)
                lineTo(14.6971f, 17.448f)
                lineTo(14.6971f, 17.448f)
                lineTo(15.2274f, 17.9783f)
                close()
                moveTo(18.4821f, 13.3755f)
                lineTo(19.2321f, 13.3755f)
                lineTo(18.4821f, 13.3755f)
                close()
                moveTo(6.0218f, 8.7727f)
                lineTo(6.5521f, 9.3031f)
                lineTo(6.5521f, 9.3031f)
                lineTo(6.0218f, 8.7727f)
                close()
                moveTo(5.2547f, 9.5399f)
                lineTo(4.7243f, 9.0095f)
                lineTo(4.7243f, 9.0095f)
                lineTo(5.2547f, 9.5399f)
                close()
                moveTo(5.785f, 10.0702f)
                lineTo(6.5521f, 9.3031f)
                lineTo(5.4915f, 8.2424f)
                lineTo(4.7243f, 9.0095f)
                lineTo(5.785f, 10.0702f)
                close()
                moveTo(14.6971f, 17.448f)
                lineTo(13.9299f, 18.2152f)
                lineTo(14.9906f, 19.2758f)
                lineTo(15.7577f, 18.5087f)
                lineTo(14.6971f, 17.448f)
                close()
                moveTo(13.9299f, 18.2152f)
                curveTo(12.8301f, 19.315f, 12.0574f, 20.0855f, 11.3958f, 20.5902f)
                curveTo(10.7516f, 21.0818f, 10.3016f, 21.2502f, 9.8575f, 21.2502f)
                lineTo(9.8575f, 22.7502f)
                curveTo(10.7615f, 22.7502f, 11.528f, 22.3761f, 12.3057f, 21.7828f)
                curveTo(13.0661f, 21.2026f, 13.9207f, 20.3457f, 14.9906f, 19.2758f)
                lineTo(13.9299f, 18.2152f)
                close()
                moveTo(4.7243f, 19.2758f)
                curveTo(5.7942f, 20.3457f, 6.6489f, 21.2026f, 7.4093f, 21.7828f)
                curveTo(8.1869f, 22.3761f, 8.9535f, 22.7502f, 9.8575f, 22.7502f)
                lineTo(9.8575f, 21.2502f)
                curveTo(9.4133f, 21.2502f, 8.9634f, 21.0818f, 8.3191f, 20.5902f)
                curveTo(7.6576f, 20.0855f, 6.8849f, 19.315f, 5.785f, 18.2152f)
                lineTo(4.7243f, 19.2758f)
                close()
                moveTo(14.6971f, 9.3031f)
                curveTo(15.797f, 10.403f, 16.5674f, 11.1756f, 17.0722f, 11.8372f)
                curveTo(17.5637f, 12.4814f, 17.7321f, 12.9314f, 17.7321f, 13.3755f)
                lineTo(19.2321f, 13.3755f)
                curveTo(19.2321f, 12.4716f, 18.858f, 11.705f, 18.2647f, 10.9273f)
                curveTo(17.6845f, 10.167f, 16.8276f, 9.3123f, 15.7577f, 8.2424f)
                lineTo(14.6971f, 9.3031f)
                close()
                moveTo(15.7577f, 18.5087f)
                curveTo(16.8276f, 17.4388f, 17.6845f, 16.5841f, 18.2647f, 15.8238f)
                curveTo(18.858f, 15.0461f, 19.2321f, 14.2795f, 19.2321f, 13.3755f)
                lineTo(17.7321f, 13.3755f)
                curveTo(17.7321f, 13.8197f, 17.5637f, 14.2696f, 17.0722f, 14.9139f)
                curveTo(16.5674f, 15.5754f, 15.797f, 16.3481f, 14.6971f, 17.448f)
                lineTo(15.7577f, 18.5087f)
                close()
                moveTo(6.5521f, 9.3031f)
                curveTo(7.652f, 8.2032f, 8.4247f, 7.4328f, 9.0863f, 6.928f)
                curveTo(9.7305f, 6.4365f, 10.1805f, 6.2681f, 10.6246f, 6.2681f)
                lineTo(10.6246f, 4.7681f)
                curveTo(9.7206f, 4.7681f, 8.9541f, 5.1421f, 8.1764f, 5.7355f)
                curveTo(7.416f, 6.3156f, 6.5614f, 7.1725f, 5.4915f, 8.2424f)
                lineTo(6.5521f, 9.3031f)
                close()
                moveTo(15.7577f, 8.2424f)
                curveTo(14.6878f, 7.1725f, 13.8332f, 6.3156f, 13.0728f, 5.7355f)
                curveTo(12.2952f, 5.1421f, 11.5286f, 4.7681f, 10.6246f, 4.7681f)
                lineTo(10.6246f, 6.2681f)
                curveTo(11.0688f, 6.2681f, 11.5187f, 6.4365f, 12.163f, 6.928f)
                curveTo(12.8245f, 7.4328f, 13.5972f, 8.2032f, 14.6971f, 9.3031f)
                lineTo(15.7577f, 8.2424f)
                close()
                moveTo(4.7243f, 9.0095f)
                curveTo(3.6544f, 10.0794f, 2.7975f, 10.9341f, 2.2174f, 11.6945f)
                curveTo(1.6241f, 12.4721f, 1.25f, 13.2387f, 1.25f, 14.1427f)
                lineTo(2.75f, 14.1427f)
                curveTo(2.75f, 13.6985f, 2.9184f, 13.2486f, 3.4099f, 12.6043f)
                curveTo(3.9147f, 11.9428f, 4.6851f, 11.1701f, 5.785f, 10.0702f)
                lineTo(4.7243f, 9.0095f)
                close()
                moveTo(5.785f, 18.2152f)
                curveTo(4.6851f, 17.1153f, 3.9147f, 16.3426f, 3.4099f, 15.681f)
                curveTo(2.9184f, 15.0368f, 2.75f, 14.5868f, 2.75f, 14.1427f)
                lineTo(1.25f, 14.1427f)
                curveTo(1.25f, 15.0467f, 1.6241f, 15.8132f, 2.2174f, 16.5909f)
                curveTo(2.7975f, 17.3513f, 3.6544f, 18.2059f, 4.7243f, 19.2758f)
                lineTo(5.785f, 18.2152f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7175f, 7.4038f)
                lineTo(18.0104f, 8.1109f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5962f, 5.2827f)
                lineTo(15.8891f, 5.9898f)
            }
        }
        .build()
        return _flashDrive!!
    }

private var _flashDrive: ImageVector? = null