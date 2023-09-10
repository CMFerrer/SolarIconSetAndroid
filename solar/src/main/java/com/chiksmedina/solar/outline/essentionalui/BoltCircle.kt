package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.BoltCircle: ImageVector
    get() {
        if (_boltCircle != null) {
            return _boltCircle!!
        }
        _boltCircle = Builder(
            name = "BoltCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.3567f, 6.7917f)
                curveTo(12.7267f, 6.5686f, 13.3708f, 6.2467f, 13.9885f, 6.6333f)
                curveTo(14.621f, 7.0291f, 14.5877f, 7.7606f, 14.5333f, 8.1838f)
                curveTo(14.4717f, 8.6628f, 14.3017f, 9.2975f, 14.102f, 10.0425f)
                lineTo(14.0468f, 10.2485f)
                curveTo(14.0077f, 10.3943f, 13.977f, 10.5092f, 13.9531f, 10.6087f)
                curveTo(13.9409f, 10.6592f, 13.9318f, 10.7009f, 13.9249f, 10.7358f)
                curveTo(14.036f, 10.7768f, 14.1989f, 10.8232f, 14.4614f, 10.8935f)
                lineTo(14.5117f, 10.907f)
                curveTo(15.0041f, 11.0389f, 15.4487f, 11.158f, 15.7772f, 11.2971f)
                curveTo(16.1032f, 11.4352f, 16.5469f, 11.6869f, 16.6905f, 12.2181f)
                lineTo(16.6926f, 12.2258f)
                lineTo(16.6949f, 12.2343f)
                lineTo(16.6969f, 12.2423f)
                lineTo(16.6988f, 12.2502f)
                lineTo(16.7006f, 12.2582f)
                lineTo(16.7024f, 12.2663f)
                lineTo(16.7042f, 12.2749f)
                lineTo(16.7058f, 12.2829f)
                curveTo(16.8158f, 12.8294f, 16.5226f, 13.2517f, 16.281f, 13.5173f)
                curveTo(16.0319f, 13.7914f, 15.6621f, 14.0888f, 15.2547f, 14.4132f)
                lineTo(13.1952f, 16.0532f)
                curveTo(12.5818f, 16.5417f, 12.0622f, 16.9555f, 11.6433f, 17.2083f)
                curveTo(11.2733f, 17.4314f, 10.6292f, 17.7532f, 10.0114f, 17.3666f)
                curveTo(9.379f, 16.9709f, 9.4122f, 16.2394f, 9.4666f, 15.8162f)
                curveTo(9.5282f, 15.3371f, 9.6983f, 14.7025f, 9.898f, 13.9574f)
                lineTo(9.9532f, 13.7515f)
                curveTo(9.9923f, 13.6057f, 10.023f, 13.4908f, 10.0469f, 13.3913f)
                curveTo(10.0578f, 13.3462f, 10.0663f, 13.3081f, 10.0728f, 13.2756f)
                curveTo(9.9614f, 13.2288f, 9.7944f, 13.175f, 9.5386f, 13.1065f)
                curveTo(9.0204f, 12.9676f, 8.5559f, 12.8407f, 8.212f, 12.6899f)
                curveTo(7.8837f, 12.5459f, 7.4469f, 12.2881f, 7.305f, 11.7632f)
                lineTo(7.3029f, 11.7555f)
                lineTo(7.3007f, 11.747f)
                lineTo(7.2987f, 11.739f)
                lineTo(7.2968f, 11.7311f)
                lineTo(7.295f, 11.7232f)
                lineTo(7.2932f, 11.7152f)
                lineTo(7.2914f, 11.7066f)
                lineTo(7.2898f, 11.6986f)
                curveTo(7.1783f, 11.1451f, 7.4814f, 10.7253f, 7.7236f, 10.466f)
                curveTo(7.963f, 10.2096f, 8.3168f, 9.9279f, 8.7029f, 9.6205f)
                lineTo(10.8047f, 7.9468f)
                curveTo(11.4181f, 7.4583f, 11.9377f, 7.0445f, 12.3567f, 6.7917f)
                close()
                moveTo(11.6948f, 9.1555f)
                curveTo(12.2924f, 8.6796f, 12.709f, 8.3495f, 13.0223f, 8.1448f)
                curveTo(12.9602f, 8.5032f, 12.8283f, 9.0004f, 12.638f, 9.7107f)
                lineTo(12.5879f, 9.8976f)
                curveTo(12.5199f, 10.1509f, 12.4506f, 10.4095f, 12.4225f, 10.6334f)
                curveTo(12.3901f, 10.8924f, 12.397f, 11.21f, 12.5811f, 11.5221f)
                lineTo(12.5852f, 11.529f)
                lineTo(12.5894f, 11.5358f)
                curveTo(12.7747f, 11.8352f, 13.0461f, 11.9945f, 13.2842f, 12.0951f)
                curveTo(13.5095f, 12.1904f, 13.7886f, 12.2662f, 14.0731f, 12.3424f)
                curveTo(14.5276f, 12.4642f, 14.8372f, 12.5484f, 15.0552f, 12.6256f)
                curveTo(14.897f, 12.7756f, 14.6622f, 12.9675f, 14.3203f, 13.2398f)
                lineTo(12.3052f, 14.8445f)
                curveTo(11.7076f, 15.3204f, 11.291f, 15.6505f, 10.9776f, 15.8551f)
                curveTo(11.0398f, 15.4968f, 11.1717f, 14.9995f, 11.362f, 14.2893f)
                lineTo(11.4121f, 14.1025f)
                curveTo(11.4801f, 13.8492f, 11.5494f, 13.5905f, 11.5775f, 13.3666f)
                curveTo(11.6099f, 13.1076f, 11.603f, 12.79f, 11.4189f, 12.478f)
                lineTo(11.4161f, 12.4795f)
                curveTo(11.239f, 12.2074f, 10.9846f, 12.0448f, 10.7517f, 11.936f)
                curveTo(10.5148f, 11.8254f, 10.2304f, 11.7389f, 9.9269f, 11.6576f)
                curveTo(9.4725f, 11.5359f, 9.1611f, 11.4482f, 8.9437f, 11.3679f)
                curveTo(9.1038f, 11.2204f, 9.3383f, 11.0321f, 9.6797f, 10.7602f)
                lineTo(11.6948f, 9.1555f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _boltCircle!!
    }

private var _boltCircle: ImageVector? = null
