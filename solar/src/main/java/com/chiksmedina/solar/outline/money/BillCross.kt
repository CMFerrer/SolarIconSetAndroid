package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.BillCross: ImageVector
    get() {
        if (_billCross != null) {
            return _billCross!!
        }
        _billCross = Builder(
            name = "BillCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.2936f, 1.25f)
                curveTo(6.3067f, 1.25f, 6.3199f, 1.25f, 6.3333f, 1.25f)
                lineTo(17.7064f, 1.25f)
                curveTo(17.9776f, 1.25f, 18.1647f, 1.25f, 18.33f, 1.2651f)
                curveTo(20.1682f, 1.4339f, 21.581f, 2.9527f, 21.736f, 4.8109f)
                curveTo(21.75f, 4.9794f, 21.75f, 5.171f, 21.75f, 5.4592f)
                lineTo(21.75f, 20.2598f)
                curveTo(21.75f, 21.0316f, 21.2676f, 21.6151f, 20.6559f, 21.8291f)
                curveTo(20.0393f, 22.0447f, 19.2904f, 21.8818f, 18.8322f, 21.2407f)
                curveTo(18.8155f, 21.2173f, 18.7998f, 21.2064f, 18.7886f, 21.2006f)
                curveTo(18.7763f, 21.1944f, 18.7632f, 21.1914f, 18.75f, 21.1914f)
                curveTo(18.7368f, 21.1914f, 18.7237f, 21.1944f, 18.7115f, 21.2006f)
                curveTo(18.7002f, 21.2064f, 18.6845f, 21.2173f, 18.6678f, 21.2407f)
                lineTo(18.2351f, 21.846f)
                curveTo(17.3735f, 23.0513f, 15.6265f, 23.0513f, 14.7649f, 21.846f)
                curveTo(14.5015f, 21.4776f, 13.9985f, 21.4776f, 13.7351f, 21.846f)
                curveTo(12.8735f, 23.0513f, 11.1265f, 23.0513f, 10.2649f, 21.846f)
                curveTo(10.0015f, 21.4776f, 9.4985f, 21.4776f, 9.2351f, 21.846f)
                curveTo(8.3735f, 23.0513f, 6.6265f, 23.0513f, 5.7649f, 21.846f)
                lineTo(5.3322f, 21.2407f)
                curveTo(5.3155f, 21.2173f, 5.2998f, 21.2064f, 5.2886f, 21.2006f)
                curveTo(5.2763f, 21.1944f, 5.2632f, 21.1914f, 5.25f, 21.1914f)
                curveTo(5.2368f, 21.1914f, 5.2237f, 21.1944f, 5.2115f, 21.2006f)
                curveTo(5.2002f, 21.2064f, 5.1845f, 21.2173f, 5.1678f, 21.2407f)
                curveTo(4.7096f, 21.8818f, 3.9607f, 22.0447f, 3.3441f, 21.8291f)
                curveTo(2.7324f, 21.6151f, 2.25f, 21.0316f, 2.25f, 20.2598f)
                verticalLineTo(5.4973f)
                curveTo(2.25f, 5.4844f, 2.25f, 5.4717f, 2.25f, 5.4592f)
                curveTo(2.25f, 5.171f, 2.25f, 4.9795f, 2.264f, 4.8109f)
                curveTo(2.419f, 2.9527f, 3.8318f, 1.4339f, 5.67f, 1.2651f)
                curveTo(5.8353f, 1.25f, 6.0224f, 1.25f, 6.2936f, 1.25f)
                close()
                moveTo(6.3333f, 2.75f)
                curveTo(6.0072f, 2.75f, 5.8948f, 2.7508f, 5.8071f, 2.7588f)
                curveTo(4.7446f, 2.8564f, 3.8577f, 3.7504f, 3.7588f, 4.9356f)
                curveTo(3.7507f, 5.0335f, 3.75f, 5.1574f, 3.75f, 5.4973f)
                verticalLineTo(20.2598f)
                curveTo(3.75f, 20.3208f, 3.7668f, 20.3522f, 3.7788f, 20.3687f)
                curveTo(3.7935f, 20.3888f, 3.8149f, 20.4046f, 3.8393f, 20.4132f)
                curveTo(3.8637f, 20.4217f, 3.8821f, 20.42f, 3.8922f, 20.4171f)
                curveTo(3.8973f, 20.4156f, 3.9182f, 20.4094f, 3.9476f, 20.3684f)
                curveTo(4.5929f, 19.4657f, 5.9072f, 19.4657f, 6.5525f, 20.3684f)
                lineTo(6.9851f, 20.9737f)
                curveTo(7.2485f, 21.3421f, 7.7515f, 21.3421f, 8.0149f, 20.9737f)
                curveTo(8.8765f, 19.7683f, 10.6235f, 19.7683f, 11.4851f, 20.9737f)
                curveTo(11.7485f, 21.3421f, 12.2515f, 21.3421f, 12.5149f, 20.9737f)
                curveTo(13.3765f, 19.7683f, 15.1235f, 19.7683f, 15.9851f, 20.9737f)
                curveTo(16.2485f, 21.3421f, 16.7515f, 21.3421f, 17.0149f, 20.9737f)
                lineTo(17.4476f, 20.3684f)
                curveTo(18.0928f, 19.4657f, 19.4072f, 19.4657f, 20.0525f, 20.3684f)
                curveTo(20.0818f, 20.4095f, 20.1026f, 20.4155f, 20.1076f, 20.417f)
                curveTo(20.1177f, 20.42f, 20.1363f, 20.4217f, 20.1607f, 20.4132f)
                curveTo(20.1851f, 20.4046f, 20.2065f, 20.3888f, 20.2212f, 20.3687f)
                curveTo(20.2332f, 20.3522f, 20.25f, 20.3208f, 20.25f, 20.2598f)
                verticalLineTo(5.4973f)
                curveTo(20.25f, 5.1574f, 20.2493f, 5.0335f, 20.2412f, 4.9355f)
                curveTo(20.1424f, 3.7504f, 19.2554f, 2.8564f, 18.1929f, 2.7588f)
                curveTo(18.1053f, 2.7508f, 17.9928f, 2.75f, 17.6667f, 2.75f)
                horizontalLineTo(6.3333f)
                close()
                moveTo(9.4697f, 7.4697f)
                curveTo(9.7626f, 7.1768f, 10.2375f, 7.1768f, 10.5304f, 7.4697f)
                lineTo(12.0f, 8.9394f)
                lineTo(13.4697f, 7.4697f)
                curveTo(13.7626f, 7.1768f, 14.2375f, 7.1768f, 14.5304f, 7.4697f)
                curveTo(14.8232f, 7.7626f, 14.8232f, 8.2375f, 14.5304f, 8.5303f)
                lineTo(13.0607f, 10.0f)
                lineTo(14.5303f, 11.4697f)
                curveTo(14.8232f, 11.7626f, 14.8232f, 12.2374f, 14.5303f, 12.5303f)
                curveTo(14.2374f, 12.8232f, 13.7626f, 12.8232f, 13.4697f, 12.5303f)
                lineTo(12.0f, 11.0607f)
                lineTo(10.5304f, 12.5303f)
                curveTo(10.2375f, 12.8232f, 9.7626f, 12.8232f, 9.4697f, 12.5303f)
                curveTo(9.1768f, 12.2374f, 9.1768f, 11.7626f, 9.4697f, 11.4697f)
                lineTo(10.9394f, 10.0f)
                lineTo(9.4697f, 8.5303f)
                curveTo(9.1768f, 8.2374f, 9.1768f, 7.7626f, 9.4697f, 7.4697f)
                close()
                moveTo(6.75f, 15.5f)
                curveTo(6.75f, 15.0858f, 7.0858f, 14.75f, 7.5f, 14.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 14.75f, 17.25f, 15.0858f, 17.25f, 15.5f)
                curveTo(17.25f, 15.9142f, 16.9142f, 16.25f, 16.5f, 16.25f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 16.25f, 6.75f, 15.9142f, 6.75f, 15.5f)
                close()
            }
        }
            .build()
        return _billCross!!
    }

private var _billCross: ImageVector? = null
