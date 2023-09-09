package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Fuel: ImageVector
    get() {
        if (_fuel != null) {
            return _fuel!!
        }
        _fuel = Builder(name = "Fuel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9506f, 10.25f)
                horizontalLineTo(12.0494f)
                curveTo(12.7142f, 10.2499f, 13.2871f, 10.2499f, 13.7458f, 10.3116f)
                curveTo(13.9888f, 10.3443f, 14.2268f, 10.3972f, 14.4515f, 10.4885f)
                curveTo(14.4574f, 10.4821f, 14.4635f, 10.4759f, 14.4697f, 10.4697f)
                lineTo(15.4697f, 9.4697f)
                curveTo(15.7626f, 9.1768f, 16.2374f, 9.1768f, 16.5303f, 9.4697f)
                curveTo(16.8232f, 9.7626f, 16.8232f, 10.2374f, 16.5303f, 10.5303f)
                lineTo(15.5303f, 11.5303f)
                curveTo(15.5241f, 11.5365f, 15.5179f, 11.5426f, 15.5115f, 11.5485f)
                curveTo(15.6028f, 11.7732f, 15.6557f, 12.0112f, 15.6884f, 12.2541f)
                curveTo(15.7501f, 12.7129f, 15.75f, 13.2858f, 15.75f, 13.9506f)
                verticalLineTo(14.0494f)
                curveTo(15.75f, 14.7142f, 15.7501f, 15.2871f, 15.6884f, 15.7458f)
                curveTo(15.6557f, 15.9888f, 15.6028f, 16.2268f, 15.5115f, 16.4515f)
                curveTo(15.5179f, 16.4574f, 15.5241f, 16.4635f, 15.5303f, 16.4697f)
                lineTo(16.5303f, 17.4697f)
                curveTo(16.8232f, 17.7625f, 16.8232f, 18.2374f, 16.5303f, 18.5303f)
                curveTo(16.2374f, 18.8232f, 15.7626f, 18.8232f, 15.4697f, 18.5303f)
                lineTo(14.4697f, 17.5303f)
                lineTo(14.4626f, 17.5232f)
                lineTo(14.4515f, 17.5115f)
                curveTo(14.2268f, 17.6028f, 13.9888f, 17.6557f, 13.7458f, 17.6884f)
                curveTo(13.2871f, 17.7501f, 12.7142f, 17.75f, 12.0494f, 17.75f)
                horizontalLineTo(11.9506f)
                curveTo(11.2858f, 17.75f, 10.7129f, 17.7501f, 10.2542f, 17.6884f)
                curveTo(10.0112f, 17.6557f, 9.7732f, 17.6028f, 9.5485f, 17.5115f)
                curveTo(9.5426f, 17.5178f, 9.5365f, 17.5241f, 9.5303f, 17.5303f)
                lineTo(8.5303f, 18.5303f)
                curveTo(8.2374f, 18.8232f, 7.7626f, 18.8232f, 7.4697f, 18.5303f)
                curveTo(7.1768f, 18.2374f, 7.1768f, 17.7625f, 7.4697f, 17.4697f)
                lineTo(8.4697f, 16.4697f)
                curveTo(8.4759f, 16.4635f, 8.4821f, 16.4574f, 8.4885f, 16.4515f)
                curveTo(8.3972f, 16.2268f, 8.3443f, 15.9888f, 8.3116f, 15.7458f)
                curveTo(8.2499f, 15.2871f, 8.25f, 14.7142f, 8.25f, 14.0494f)
                verticalLineTo(13.9506f)
                curveTo(8.25f, 13.2858f, 8.2499f, 12.7129f, 8.3116f, 12.2541f)
                curveTo(8.3443f, 12.0112f, 8.3972f, 11.7732f, 8.4885f, 11.5485f)
                curveTo(8.4821f, 11.5426f, 8.4759f, 11.5365f, 8.4697f, 11.5303f)
                lineTo(7.4697f, 10.5303f)
                curveTo(7.1768f, 10.2374f, 7.1768f, 9.7626f, 7.4697f, 9.4697f)
                curveTo(7.7626f, 9.1768f, 8.2374f, 9.1768f, 8.5303f, 9.4697f)
                lineTo(9.5303f, 10.4697f)
                curveTo(9.5365f, 10.4759f, 9.5426f, 10.4821f, 9.5485f, 10.4885f)
                curveTo(9.7732f, 10.3972f, 10.0112f, 10.3443f, 10.2542f, 10.3116f)
                curveTo(10.7129f, 10.2499f, 11.2858f, 10.2499f, 11.9506f, 10.25f)
                close()
                moveTo(10.454f, 11.7982f)
                curveTo(10.1287f, 11.842f, 10.0268f, 11.9126f, 9.9697f, 11.9697f)
                curveTo(9.9126f, 12.0268f, 9.842f, 12.1287f, 9.7982f, 12.454f)
                curveTo(9.7516f, 12.8009f, 9.75f, 13.2717f, 9.75f, 14.0f)
                curveTo(9.75f, 14.7283f, 9.7516f, 15.1991f, 9.7982f, 15.546f)
                curveTo(9.842f, 15.8713f, 9.9126f, 15.9732f, 9.9697f, 16.0303f)
                curveTo(10.0268f, 16.0874f, 10.1287f, 16.158f, 10.454f, 16.2018f)
                curveTo(10.8009f, 16.2484f, 11.2717f, 16.25f, 12.0f, 16.25f)
                curveTo(12.7283f, 16.25f, 13.1991f, 16.2484f, 13.546f, 16.2018f)
                curveTo(13.8713f, 16.158f, 13.9732f, 16.0874f, 14.0303f, 16.0303f)
                curveTo(14.0874f, 15.9732f, 14.158f, 15.8713f, 14.2018f, 15.546f)
                curveTo(14.2484f, 15.1991f, 14.25f, 14.7283f, 14.25f, 14.0f)
                curveTo(14.25f, 13.2717f, 14.2484f, 12.8009f, 14.2018f, 12.454f)
                curveTo(14.158f, 12.1287f, 14.0874f, 12.0268f, 14.0303f, 11.9697f)
                curveTo(13.9732f, 11.9126f, 13.8713f, 11.842f, 13.546f, 11.7982f)
                curveTo(13.1991f, 11.7516f, 12.7283f, 11.75f, 12.0f, 11.75f)
                curveTo(11.2717f, 11.75f, 10.8009f, 11.7516f, 10.454f, 11.7982f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.1215f, 2.3782f)
                curveTo(19.2746f, 2.1512f, 20.2973f, 2.1847f, 21.1755f, 2.8198f)
                curveTo(22.0497f, 3.4521f, 22.4147f, 4.4164f, 22.5843f, 5.5932f)
                curveTo(22.75f, 6.7427f, 22.75f, 8.2593f, 22.75f, 10.1691f)
                verticalLineTo(15.9374f)
                curveTo(22.75f, 17.3332f, 22.75f, 18.4553f, 22.6337f, 19.3372f)
                curveTo(22.5133f, 20.2506f, 22.2561f, 21.0184f, 21.6567f, 21.6294f)
                curveTo(21.0554f, 22.2424f, 20.2964f, 22.5073f, 19.3937f, 22.6311f)
                curveTo(18.5257f, 22.75f, 17.4226f, 22.75f, 16.0558f, 22.75f)
                horizontalLineTo(7.9442f)
                curveTo(6.5774f, 22.75f, 5.4743f, 22.75f, 4.6063f, 22.6311f)
                curveTo(3.7036f, 22.5073f, 2.9446f, 22.2424f, 2.3433f, 21.6294f)
                curveTo(1.7439f, 21.0184f, 1.4867f, 20.2506f, 1.3663f, 19.3372f)
                curveTo(1.25f, 18.4553f, 1.25f, 17.3332f, 1.25f, 15.9375f)
                verticalLineTo(13.0439f)
                curveTo(1.25f, 12.0323f, 1.25f, 11.2114f, 1.3237f, 10.5465f)
                curveTo(1.4005f, 9.854f, 1.5635f, 9.2567f, 1.9377f, 8.719f)
                curveTo(2.3127f, 8.1802f, 2.8146f, 7.8237f, 3.4344f, 7.5191f)
                curveTo(3.6796f, 7.3985f, 3.9536f, 7.2814f, 4.2568f, 7.1618f)
                curveTo(4.2523f, 7.1286f, 4.25f, 7.0946f, 4.25f, 7.0601f)
                lineTo(4.25f, 7.0192f)
                curveTo(4.25f, 6.4016f, 4.25f, 5.8772f, 4.2968f, 5.4533f)
                curveTo(4.3463f, 5.0059f, 4.4555f, 4.5788f, 4.7388f, 4.2021f)
                curveTo(4.865f, 4.0343f, 5.0126f, 3.8837f, 5.1779f, 3.7543f)
                curveTo(5.551f, 3.4623f, 5.9761f, 3.349f, 6.4199f, 3.298f)
                curveTo(6.838f, 3.2499f, 7.3542f, 3.25f, 7.958f, 3.25f)
                lineTo(8.907f, 3.2499f)
                curveTo(9.3256f, 3.2495f, 9.6768f, 3.2492f, 9.9849f, 3.3334f)
                curveTo(10.6457f, 3.514f, 11.1854f, 3.9685f, 11.4874f, 4.5658f)
                lineTo(13.8275f, 3.7309f)
                curveTo(15.5932f, 3.1009f, 16.9995f, 2.5991f, 18.1215f, 2.3782f)
                close()
                moveTo(18.4112f, 3.8499f)
                curveTo(17.4122f, 4.0466f, 16.1113f, 4.5086f, 14.2699f, 5.1656f)
                lineTo(6.2699f, 8.0201f)
                curveTo(5.2832f, 8.3721f, 4.603f, 8.616f, 4.096f, 8.8652f)
                curveTo(3.607f, 9.1056f, 3.3471f, 9.3197f, 3.1688f, 9.5759f)
                curveTo(2.9898f, 9.8331f, 2.8761f, 10.1574f, 2.8146f, 10.7118f)
                curveTo(2.7511f, 11.2844f, 2.75f, 12.022f, 2.75f, 13.0869f)
                verticalLineTo(15.8834f)
                curveTo(2.75f, 17.3459f, 2.7515f, 18.3687f, 2.8534f, 19.1411f)
                curveTo(2.9526f, 19.8934f, 3.1347f, 20.2943f, 3.4141f, 20.579f)
                curveTo(3.6915f, 20.8618f, 4.0789f, 21.0448f, 4.81f, 21.145f)
                curveTo(5.5642f, 21.2483f, 6.5642f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4358f, 21.25f, 18.4358f, 21.2483f, 19.19f, 21.145f)
                curveTo(19.9211f, 21.0448f, 20.3085f, 20.8618f, 20.5859f, 20.579f)
                curveTo(20.8653f, 20.2943f, 21.0474f, 19.8934f, 21.1466f, 19.1411f)
                curveTo(21.2485f, 18.3687f, 21.25f, 17.3459f, 21.25f, 15.8834f)
                verticalLineTo(10.2325f)
                curveTo(21.25f, 8.245f, 21.2481f, 6.8371f, 21.0997f, 5.8072f)
                curveTo(20.9533f, 4.7919f, 20.6862f, 4.3172f, 20.2964f, 4.0353f)
                curveTo(19.9104f, 3.7561f, 19.3921f, 3.6568f, 18.4112f, 3.8499f)
                close()
                moveTo(10.0445f, 5.0807f)
                curveTo(9.9273f, 4.935f, 9.7684f, 4.8292f, 9.5894f, 4.7803f)
                curveTo(9.5029f, 4.7567f, 9.3746f, 4.75f, 8.8182f, 4.75f)
                horizontalLineTo(8.0f)
                curveTo(7.3425f, 4.75f, 6.9134f, 4.7511f, 6.5913f, 4.7882f)
                curveTo(6.2852f, 4.8234f, 6.1701f, 4.8826f, 6.1025f, 4.9355f)
                curveTo(6.0409f, 4.9837f, 5.9854f, 5.0402f, 5.9375f, 5.1039f)
                curveTo(5.8826f, 5.1768f, 5.8228f, 5.3006f, 5.7877f, 5.6181f)
                curveTo(5.7599f, 5.8696f, 5.7526f, 6.1837f, 5.7507f, 6.6127f)
                lineTo(10.0445f, 5.0807f)
                close()
            }
        }
        .build()
        return _fuel!!
    }

private var _fuel: ImageVector? = null
