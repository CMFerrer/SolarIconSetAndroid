package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.BenzeneRing: ImageVector
    get() {
        if (_benzeneRing != null) {
            return _benzeneRing!!
        }
        _benzeneRing = Builder(
            name = "BenzeneRing", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.384f, 15.1442f)
                curveTo(16.7398f, 14.9322f, 16.8563f, 14.4718f, 16.6442f, 14.116f)
                curveTo(16.4322f, 13.7602f, 15.9718f, 13.6437f, 15.616f, 13.8558f)
                lineTo(11.616f, 16.2398f)
                curveTo(11.2602f, 16.4519f, 11.1437f, 16.9122f, 11.3557f, 17.268f)
                curveTo(11.5678f, 17.6239f, 12.0282f, 17.7404f, 12.384f, 17.5283f)
                lineTo(16.384f, 15.1442f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8394f, 3.5401f)
                curveTo(11.2105f, 3.367f, 11.581f, 3.25f, 12.0f, 3.25f)
                curveTo(12.4189f, 3.25f, 12.7894f, 3.367f, 13.1606f, 3.5401f)
                curveTo(13.5091f, 3.7027f, 13.9063f, 3.9388f, 14.3733f, 4.2164f)
                lineTo(17.3927f, 6.0112f)
                curveTo(17.86f, 6.289f, 18.2572f, 6.525f, 18.5679f, 6.7543f)
                curveTo(18.7182f, 6.8652f, 18.8578f, 6.9811f, 18.9846f, 7.1089f)
                lineTo(21.584f, 5.376f)
                curveTo(21.9286f, 5.1462f, 22.3943f, 5.2393f, 22.624f, 5.584f)
                curveTo(22.8538f, 5.9286f, 22.7607f, 6.3943f, 22.416f, 6.624f)
                lineTo(19.668f, 8.456f)
                curveTo(19.6874f, 8.5653f, 19.7018f, 8.6767f, 19.7127f, 8.7906f)
                curveTo(19.75f, 9.18f, 19.75f, 9.6501f, 19.75f, 10.2071f)
                verticalLineTo(13.7929f)
                curveTo(19.75f, 14.3499f, 19.75f, 14.82f, 19.7127f, 15.2094f)
                curveTo(19.6732f, 15.6223f, 19.5878f, 16.0023f, 19.3834f, 16.3668f)
                curveTo(19.1784f, 16.7325f, 18.8991f, 17.0013f, 18.5679f, 17.2457f)
                curveTo(18.2572f, 17.475f, 17.8601f, 17.711f, 17.3927f, 17.9888f)
                lineTo(14.3734f, 19.7836f)
                curveTo(13.9064f, 20.0611f, 13.5091f, 20.2974f, 13.1606f, 20.4599f)
                curveTo(12.7894f, 20.633f, 12.4189f, 20.75f, 12.0f, 20.75f)
                curveTo(11.581f, 20.75f, 11.2105f, 20.633f, 10.8394f, 20.4599f)
                curveTo(10.4909f, 20.2974f, 10.0937f, 20.0613f, 9.6268f, 19.7837f)
                lineTo(6.6072f, 17.9888f)
                curveTo(6.1399f, 17.711f, 5.7428f, 17.475f, 5.4321f, 17.2457f)
                curveTo(5.2818f, 17.1348f, 5.1422f, 17.0189f, 5.0153f, 16.8911f)
                lineTo(2.416f, 18.624f)
                curveTo(2.0714f, 18.8538f, 1.6057f, 18.7607f, 1.3759f, 18.416f)
                curveTo(1.1462f, 18.0714f, 1.2393f, 17.6057f, 1.584f, 17.376f)
                lineTo(4.332f, 15.544f)
                curveTo(4.3125f, 15.4347f, 4.2982f, 15.3233f, 4.2872f, 15.2094f)
                curveTo(4.25f, 14.82f, 4.25f, 14.3499f, 4.25f, 13.7929f)
                verticalLineTo(10.2071f)
                curveTo(4.25f, 9.6501f, 4.25f, 9.18f, 4.2872f, 8.7906f)
                curveTo(4.2982f, 8.6767f, 4.3125f, 8.5653f, 4.332f, 8.456f)
                lineTo(1.584f, 6.624f)
                curveTo(1.2393f, 6.3943f, 1.1462f, 5.9286f, 1.3759f, 5.584f)
                curveTo(1.6057f, 5.2393f, 2.0714f, 5.1462f, 2.416f, 5.376f)
                lineTo(5.0153f, 7.1089f)
                curveTo(5.1422f, 6.9811f, 5.2818f, 6.8652f, 5.4321f, 6.7543f)
                curveTo(5.7428f, 6.525f, 6.1399f, 6.289f, 6.6073f, 6.0112f)
                lineTo(9.6266f, 4.2164f)
                curveTo(10.0936f, 3.9388f, 10.4909f, 3.7027f, 10.8394f, 3.5401f)
                close()
                moveTo(11.4734f, 4.8995f)
                curveTo(11.2011f, 5.0266f, 10.8684f, 5.2233f, 10.3625f, 5.524f)
                lineTo(7.4039f, 7.2826f)
                curveTo(6.8982f, 7.5832f, 6.5662f, 7.7816f, 6.3227f, 7.9612f)
                curveTo(6.0932f, 8.1306f, 5.9906f, 8.2497f, 5.9249f, 8.3668f)
                curveTo(5.8586f, 8.4851f, 5.8086f, 8.6396f, 5.7804f, 8.9336f)
                curveTo(5.7508f, 9.2431f, 5.75f, 9.641f, 5.75f, 10.2414f)
                verticalLineTo(13.7586f)
                curveTo(5.75f, 14.359f, 5.7508f, 14.7569f, 5.7804f, 15.0664f)
                curveTo(5.8086f, 15.3604f, 5.8586f, 15.5149f, 5.9249f, 15.6332f)
                curveTo(5.9906f, 15.7503f, 6.0932f, 15.8694f, 6.3227f, 16.0388f)
                curveTo(6.5662f, 16.2184f, 6.8982f, 16.4168f, 7.4039f, 16.7174f)
                lineTo(10.3625f, 18.476f)
                curveTo(10.8684f, 18.7767f, 11.2011f, 18.9734f, 11.4734f, 19.1005f)
                curveTo(11.7307f, 19.2205f, 11.8775f, 19.25f, 12.0f, 19.25f)
                curveTo(12.1225f, 19.25f, 12.2693f, 19.2205f, 12.5266f, 19.1005f)
                curveTo(12.7989f, 18.9734f, 13.1316f, 18.7767f, 13.6375f, 18.476f)
                lineTo(16.596f, 16.7174f)
                curveTo(17.1018f, 16.4168f, 17.4338f, 16.2184f, 17.6772f, 16.0388f)
                curveTo(17.9067f, 15.8694f, 18.0094f, 15.7503f, 18.0751f, 15.6332f)
                curveTo(18.1414f, 15.5149f, 18.1914f, 15.3604f, 18.2196f, 15.0664f)
                curveTo(18.2492f, 14.7569f, 18.25f, 14.359f, 18.25f, 13.7586f)
                verticalLineTo(10.2414f)
                curveTo(18.25f, 9.641f, 18.2492f, 9.2431f, 18.2196f, 8.9336f)
                curveTo(18.1914f, 8.6396f, 18.1414f, 8.4851f, 18.0751f, 8.3668f)
                curveTo(18.0094f, 8.2497f, 17.9067f, 8.1306f, 17.6772f, 7.9612f)
                curveTo(17.4338f, 7.7816f, 17.1018f, 7.5832f, 16.596f, 7.2826f)
                lineTo(13.6375f, 5.524f)
                curveTo(13.1316f, 5.2233f, 12.7989f, 5.0266f, 12.5266f, 4.8995f)
                curveTo(12.2693f, 4.7795f, 12.1225f, 4.75f, 12.0f, 4.75f)
                curveTo(11.8775f, 4.75f, 11.7307f, 4.7795f, 11.4734f, 4.8995f)
                close()
            }
        }
            .build()
        return _benzeneRing!!
    }

private var _benzeneRing: ImageVector? = null
