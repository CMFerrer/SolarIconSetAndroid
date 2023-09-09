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

public val EssentionalUiGroup.SliderHorizontal: ImageVector
    get() {
        if (_sliderHorizontal != null) {
            return _sliderHorizontal!!
        }
        _sliderHorizontal = Builder(name = "SliderHorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.7866f, 4.2969f)
                curveTo(3.758f, 4.6463f, 3.7517f, 5.0585f, 3.7504f, 5.5428f)
                curveTo(3.2169f, 5.7f, 2.7482f, 5.9485f, 2.3484f, 6.3484f)
                curveTo(1.7464f, 6.9503f, 1.4875f, 7.7081f, 1.3665f, 8.6082f)
                curveTo(1.25f, 9.4752f, 1.25f, 10.5775f, 1.25f, 11.9451f)
                verticalLineTo(12.0549f)
                curveTo(1.25f, 13.4225f, 1.25f, 14.5248f, 1.3665f, 15.3918f)
                curveTo(1.4875f, 16.2919f, 1.7464f, 17.0497f, 2.3484f, 17.6516f)
                curveTo(2.7482f, 18.0515f, 3.2169f, 18.3f, 3.7504f, 18.4572f)
                curveTo(3.7517f, 18.9415f, 3.758f, 19.3537f, 3.7866f, 19.7031f)
                curveTo(3.8244f, 20.1663f, 3.9051f, 20.5847f, 4.1042f, 20.9755f)
                curveTo(4.4158f, 21.587f, 4.913f, 22.0842f, 5.5245f, 22.3958f)
                curveTo(5.9153f, 22.5949f, 6.3337f, 22.6756f, 6.7969f, 22.7134f)
                curveTo(7.2445f, 22.75f, 7.7952f, 22.75f, 8.4686f, 22.75f)
                horizontalLineTo(15.5314f)
                curveTo(16.2048f, 22.75f, 16.7555f, 22.75f, 17.2031f, 22.7134f)
                curveTo(17.6663f, 22.6756f, 18.0847f, 22.5949f, 18.4755f, 22.3958f)
                curveTo(19.087f, 22.0842f, 19.5842f, 21.587f, 19.8958f, 20.9755f)
                curveTo(20.0949f, 20.5847f, 20.1756f, 20.1663f, 20.2134f, 19.7031f)
                curveTo(20.242f, 19.3537f, 20.2483f, 18.9415f, 20.2496f, 18.4572f)
                curveTo(20.7831f, 18.3f, 21.2518f, 18.0515f, 21.6517f, 17.6516f)
                curveTo(22.2536f, 17.0497f, 22.5125f, 16.2919f, 22.6335f, 15.3917f)
                curveTo(22.75f, 14.5248f, 22.75f, 13.4225f, 22.75f, 12.0549f)
                verticalLineTo(11.9451f)
                curveTo(22.75f, 10.5775f, 22.75f, 9.4752f, 22.6335f, 8.6082f)
                curveTo(22.5125f, 7.7081f, 22.2536f, 6.9503f, 21.6517f, 6.3484f)
                curveTo(21.2518f, 5.9485f, 20.7831f, 5.7f, 20.2496f, 5.5428f)
                curveTo(20.2482f, 5.0585f, 20.242f, 4.6463f, 20.2134f, 4.2969f)
                curveTo(20.1756f, 3.8337f, 20.0949f, 3.4153f, 19.8958f, 3.0245f)
                curveTo(19.5842f, 2.413f, 19.087f, 1.9158f, 18.4755f, 1.6042f)
                curveTo(18.0847f, 1.4051f, 17.6663f, 1.3244f, 17.2031f, 1.2866f)
                curveTo(16.7555f, 1.25f, 16.2048f, 1.25f, 15.5314f, 1.25f)
                horizontalLineTo(8.4686f)
                curveTo(7.7952f, 1.25f, 7.2445f, 1.25f, 6.7969f, 1.2866f)
                curveTo(6.3337f, 1.3244f, 5.9153f, 1.4051f, 5.5245f, 1.6042f)
                curveTo(4.913f, 1.9158f, 4.4158f, 2.413f, 4.1042f, 3.0245f)
                curveTo(3.9051f, 3.4153f, 3.8244f, 3.8337f, 3.7866f, 4.2969f)
                close()
                moveTo(17.0809f, 2.7816f)
                curveTo(16.7017f, 2.7506f, 16.2124f, 2.75f, 15.5f, 2.75f)
                lineTo(8.5f, 2.75f)
                curveTo(7.7876f, 2.75f, 7.2983f, 2.7506f, 6.9191f, 2.7816f)
                curveTo(6.5486f, 2.8118f, 6.3496f, 2.8674f, 6.2055f, 2.9407f)
                curveTo(5.8762f, 3.1085f, 5.6085f, 3.3762f, 5.4407f, 3.7055f)
                curveTo(5.3674f, 3.8496f, 5.3118f, 4.0486f, 5.2816f, 4.4191f)
                curveTo(5.2619f, 4.6597f, 5.2545f, 4.9446f, 5.2517f, 5.3026f)
                curveTo(6.0023f, 5.25f, 6.8956f, 5.25f, 7.9451f, 5.25f)
                lineTo(16.0549f, 5.25f)
                curveTo(17.1044f, 5.25f, 17.9977f, 5.25f, 18.7483f, 5.3026f)
                curveTo(18.7455f, 4.9446f, 18.7381f, 4.6597f, 18.7184f, 4.4191f)
                curveTo(18.6882f, 4.0486f, 18.6327f, 3.8496f, 18.5593f, 3.7055f)
                curveTo(18.3915f, 3.3762f, 18.1238f, 3.1085f, 17.7945f, 2.9407f)
                curveTo(17.6504f, 2.8674f, 17.4514f, 2.8118f, 17.0809f, 2.7816f)
                close()
                moveTo(18.7483f, 18.6973f)
                curveTo(17.9977f, 18.75f, 17.1044f, 18.75f, 16.0549f, 18.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.8956f, 18.75f, 6.0023f, 18.75f, 5.2517f, 18.6973f)
                curveTo(5.2545f, 19.0554f, 5.2619f, 19.3403f, 5.2816f, 19.5809f)
                curveTo(5.3118f, 19.9514f, 5.3674f, 20.1504f, 5.4407f, 20.2945f)
                curveTo(5.6085f, 20.6238f, 5.8762f, 20.8915f, 6.2055f, 21.0593f)
                curveTo(6.3496f, 21.1327f, 6.5486f, 21.1882f, 6.9191f, 21.2184f)
                curveTo(7.2983f, 21.2494f, 7.7876f, 21.25f, 8.5f, 21.25f)
                horizontalLineTo(15.5f)
                curveTo(16.2124f, 21.25f, 16.7017f, 21.2494f, 17.0809f, 21.2184f)
                curveTo(17.4514f, 21.1882f, 17.6504f, 21.1327f, 17.7945f, 21.0593f)
                curveTo(18.1238f, 20.8915f, 18.3915f, 20.6238f, 18.5593f, 20.2945f)
                curveTo(18.6327f, 20.1504f, 18.6882f, 19.9514f, 18.7184f, 19.5809f)
                curveTo(18.7381f, 19.3403f, 18.7455f, 19.0554f, 18.7483f, 18.6973f)
                close()
                moveTo(19.1919f, 6.8531f)
                curveTo(18.4365f, 6.7516f, 17.4354f, 6.75f, 16.0f, 6.75f)
                lineTo(8.0f, 6.75f)
                curveTo(6.5646f, 6.75f, 5.5635f, 6.7516f, 4.8081f, 6.8531f)
                curveTo(4.0743f, 6.9518f, 3.6858f, 7.1322f, 3.409f, 7.409f)
                curveTo(3.1323f, 7.6858f, 2.9518f, 8.0744f, 2.8531f, 8.8081f)
                curveTo(2.7516f, 9.5635f, 2.75f, 10.5646f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4354f, 2.7516f, 14.4365f, 2.8531f, 15.1919f)
                curveTo(2.9518f, 15.9257f, 3.1323f, 16.3142f, 3.409f, 16.591f)
                curveTo(3.6858f, 16.8678f, 4.0743f, 17.0482f, 4.8081f, 17.1469f)
                curveTo(5.5635f, 17.2484f, 6.5646f, 17.25f, 8.0f, 17.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 17.25f, 18.4365f, 17.2484f, 19.1919f, 17.1469f)
                curveTo(19.9257f, 17.0482f, 20.3142f, 16.8678f, 20.591f, 16.591f)
                curveTo(20.8678f, 16.3142f, 21.0482f, 15.9257f, 21.1469f, 15.1919f)
                curveTo(21.2484f, 14.4365f, 21.25f, 13.4354f, 21.25f, 12.0f)
                curveTo(21.25f, 10.5646f, 21.2484f, 9.5635f, 21.1469f, 8.8081f)
                curveTo(21.0482f, 8.0743f, 20.8678f, 7.6858f, 20.591f, 7.409f)
                curveTo(20.3142f, 7.1322f, 19.9257f, 6.9518f, 19.1919f, 6.8531f)
                close()
            }
        }
        .build()
        return _sliderHorizontal!!
    }

private var _sliderHorizontal: ImageVector? = null
