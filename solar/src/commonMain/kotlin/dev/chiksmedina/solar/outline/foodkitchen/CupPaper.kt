package dev.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.CupPaper: ImageVector
    get() {
        if (_cupPaper != null) {
            return _cupPaper!!
        }
        _cupPaper = Builder(
            name = "CupPaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.1465f, 1.25f)
                horizontalLineTo(14.8535f)
                curveTo(15.7395f, 1.25f, 16.4604f, 1.25f, 17.048f, 1.3093f)
                curveTo(17.66f, 1.3712f, 18.1938f, 1.5022f, 18.687f, 1.8054f)
                curveTo(18.8429f, 1.9012f, 18.9915f, 2.0083f, 19.1318f, 2.1259f)
                curveTo(19.5755f, 2.4977f, 19.8688f, 2.9626f, 20.1211f, 3.5236f)
                curveTo(20.3634f, 4.0621f, 20.5916f, 4.7459f, 20.872f, 5.5863f)
                lineTo(20.8843f, 5.6232f)
                lineTo(20.9335f, 5.7706f)
                curveTo(21.0814f, 6.2138f, 21.213f, 6.608f, 21.2807f, 6.936f)
                curveTo(21.3523f, 7.2826f, 21.3826f, 7.6833f, 21.1982f, 8.0789f)
                curveTo(21.1052f, 8.2783f, 20.9754f, 8.4585f, 20.8156f, 8.6098f)
                curveTo(20.4988f, 8.91f, 20.1091f, 9.008f, 19.7577f, 9.0499f)
                curveTo(19.5774f, 9.0713f, 19.3728f, 9.0811f, 19.1487f, 9.0856f)
                lineTo(17.736f, 18.735f)
                curveTo(17.6225f, 19.5107f, 17.5272f, 20.1617f, 17.3844f, 20.6761f)
                curveTo(17.233f, 21.2212f, 17.0057f, 21.7038f, 16.5697f, 22.0806f)
                curveTo(16.1336f, 22.4575f, 15.6233f, 22.6125f, 15.062f, 22.6833f)
                curveTo(14.5323f, 22.75f, 13.8743f, 22.75f, 13.0904f, 22.75f)
                horizontalLineTo(10.9096f)
                curveTo(10.1257f, 22.75f, 9.4677f, 22.75f, 8.938f, 22.6833f)
                curveTo(8.3767f, 22.6125f, 7.8664f, 22.4575f, 7.4303f, 22.0806f)
                curveTo(6.9942f, 21.7038f, 6.767f, 21.2212f, 6.6156f, 20.6761f)
                curveTo(6.4728f, 20.1617f, 6.3775f, 19.5106f, 6.264f, 18.735f)
                lineTo(4.8513f, 9.0856f)
                curveTo(4.6272f, 9.0811f, 4.4226f, 9.0713f, 4.2423f, 9.0499f)
                curveTo(3.8909f, 9.008f, 3.5012f, 8.91f, 3.1844f, 8.6098f)
                curveTo(3.0246f, 8.4585f, 2.8948f, 8.2783f, 2.8018f, 8.0789f)
                curveTo(2.6174f, 7.6833f, 2.6477f, 7.2826f, 2.7193f, 6.936f)
                curveTo(2.787f, 6.608f, 2.9186f, 6.2138f, 3.0665f, 5.7706f)
                curveTo(3.071f, 5.7573f, 3.0754f, 5.7439f, 3.0799f, 5.7305f)
                lineTo(3.128f, 5.5864f)
                curveTo(3.4084f, 4.746f, 3.6366f, 4.0622f, 3.8789f, 3.5235f)
                curveTo(4.1312f, 2.9626f, 4.4245f, 2.4977f, 4.8682f, 2.1259f)
                curveTo(5.0085f, 2.0083f, 5.1571f, 1.9012f, 5.313f, 1.8054f)
                curveTo(5.8062f, 1.5022f, 6.34f, 1.3712f, 6.952f, 1.3093f)
                curveTo(7.5396f, 1.25f, 8.2605f, 1.25f, 9.1465f, 1.25f)
                close()
                moveTo(6.3678f, 9.0894f)
                lineTo(6.6841f, 11.25f)
                horizontalLineTo(17.3159f)
                lineTo(17.6322f, 9.0894f)
                horizontalLineTo(6.3678f)
                close()
                moveTo(17.0963f, 12.75f)
                horizontalLineTo(6.9037f)
                lineTo(7.4162f, 16.25f)
                horizontalLineTo(16.5838f)
                lineTo(17.0963f, 12.75f)
                close()
                moveTo(16.3642f, 17.75f)
                horizontalLineTo(7.6358f)
                lineTo(7.7413f, 18.4708f)
                curveTo(7.8635f, 19.3057f, 7.9464f, 19.8623f, 8.061f, 20.2749f)
                curveTo(8.1699f, 20.6671f, 8.2839f, 20.8358f, 8.4111f, 20.9457f)
                curveTo(8.5384f, 21.0557f, 8.7218f, 21.1441f, 9.1257f, 21.195f)
                curveTo(9.5505f, 21.2486f, 10.1132f, 21.25f, 10.957f, 21.25f)
                horizontalLineTo(13.043f)
                curveTo(13.8868f, 21.25f, 14.4495f, 21.2486f, 14.8743f, 21.195f)
                curveTo(15.2782f, 21.1441f, 15.4616f, 21.0557f, 15.5888f, 20.9457f)
                curveTo(15.7161f, 20.8358f, 15.8301f, 20.6671f, 15.939f, 20.2749f)
                curveTo(16.0536f, 19.8623f, 16.1365f, 19.3057f, 16.2587f, 18.4708f)
                lineTo(16.3642f, 17.75f)
                close()
                moveTo(7.1027f, 2.8017f)
                curveTo(6.6151f, 2.851f, 6.3281f, 2.9421f, 6.0986f, 3.0832f)
                curveTo(6.005f, 3.1407f, 5.9159f, 3.205f, 5.8317f, 3.2755f)
                curveTo(5.6252f, 3.4486f, 5.4479f, 3.692f, 5.2468f, 4.1389f)
                curveTo(5.0392f, 4.6004f, 4.8342f, 5.2119f, 4.5386f, 6.098f)
                lineTo(4.5028f, 6.2053f)
                curveTo(4.3373f, 6.7011f, 4.2358f, 7.0094f, 4.1883f, 7.2394f)
                curveTo(4.1605f, 7.3737f, 4.1624f, 7.4334f, 4.1646f, 7.4519f)
                curveTo(4.1765f, 7.4754f, 4.192f, 7.4969f, 4.2105f, 7.5155f)
                curveTo(4.2273f, 7.5235f, 4.2834f, 7.5442f, 4.4195f, 7.5604f)
                curveTo(4.6527f, 7.5881f, 4.9774f, 7.5894f, 5.5f, 7.5894f)
                horizontalLineTo(18.5f)
                curveTo(19.0226f, 7.5894f, 19.3473f, 7.5881f, 19.5805f, 7.5604f)
                curveTo(19.7166f, 7.5442f, 19.7726f, 7.5235f, 19.7895f, 7.5155f)
                curveTo(19.808f, 7.4969f, 19.8235f, 7.4754f, 19.8353f, 7.4519f)
                curveTo(19.8375f, 7.4334f, 19.8395f, 7.3737f, 19.8117f, 7.2394f)
                curveTo(19.7642f, 7.0094f, 19.6627f, 6.7011f, 19.4972f, 6.2053f)
                lineTo(19.4614f, 6.098f)
                curveTo(19.1658f, 5.212f, 18.9608f, 4.6004f, 18.7532f, 4.1389f)
                curveTo(18.5521f, 3.692f, 18.3748f, 3.4486f, 18.1683f, 3.2755f)
                curveTo(18.0841f, 3.205f, 17.995f, 3.1407f, 17.9014f, 3.0832f)
                curveTo(17.6718f, 2.9421f, 17.3849f, 2.851f, 16.8973f, 2.8017f)
                curveTo(16.3938f, 2.7509f, 15.7488f, 2.75f, 14.8148f, 2.75f)
                horizontalLineTo(9.1852f)
                curveTo(8.2512f, 2.75f, 7.6062f, 2.7509f, 7.1027f, 2.8017f)
                close()
            }
        }
            .build()
        return _cupPaper!!
    }

private var _cupPaper: ImageVector? = null
