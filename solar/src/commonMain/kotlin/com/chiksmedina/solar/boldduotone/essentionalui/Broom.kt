package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(
            name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.5302f, 2.5303f)
                curveTo(22.8231f, 2.2374f, 22.8231f, 1.7626f, 22.5302f, 1.4697f)
                curveTo(22.2373f, 1.1768f, 21.7625f, 1.1768f, 21.4696f, 1.4697f)
                lineTo(19.0676f, 3.8716f)
                curveTo(19.2694f, 4.0148f, 19.4619f, 4.1767f, 19.6427f, 4.3576f)
                curveTo(19.8234f, 4.5382f, 19.9853f, 4.7306f, 20.1284f, 4.9322f)
                lineTo(22.5302f, 2.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.4485f, 11.4112f)
                lineTo(3.1896f, 12.6295f)
                curveTo(5.2228f, 15.9716f, 8.0282f, 18.7771f, 11.3703f, 20.8102f)
                lineTo(12.5886f, 21.5514f)
                curveTo(14.4872f, 22.5205f, 16.9425f, 21.8979f, 18.0027f, 19.8899f)
                curveTo(18.5037f, 18.9411f, 18.9798f, 17.8777f, 19.2819f, 16.821f)
                curveTo(19.7699f, 15.114f, 19.9408f, 13.5612f, 19.9945f, 12.4895f)
                curveTo(20.0266f, 11.8492f, 20.0426f, 11.5291f, 19.8902f, 11.1335f)
                curveTo(19.7378f, 10.7378f, 19.4738f, 10.4738f, 18.9456f, 9.9458f)
                lineTo(14.1203f, 5.1213f)
                curveTo(13.6288f, 4.6298f, 13.383f, 4.3841f, 13.0133f, 4.2318f)
                curveTo(12.6435f, 4.0796f, 12.3489f, 4.0807f, 11.7597f, 4.0831f)
                curveTo(10.6466f, 4.0876f, 8.9756f, 4.2043f, 7.179f, 4.7179f)
                curveTo(6.1223f, 5.02f, 5.0588f, 5.4961f, 4.11f, 5.9971f)
                curveTo(2.102f, 7.0573f, 1.4794f, 9.5127f, 2.4485f, 11.4112f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.6428f, 4.3576f)
                curveTo(17.9069f, 2.6216f, 15.0924f, 2.6218f, 13.3564f, 4.3576f)
                lineTo(13.3186f, 4.3955f)
                curveTo(13.55f, 4.551f, 13.7743f, 4.7752f, 14.1203f, 5.1212f)
                lineTo(18.9456f, 9.9457f)
                curveTo(19.2474f, 10.2475f, 19.463f, 10.463f, 19.6208f, 10.6662f)
                lineTo(19.6429f, 10.644f)
                curveTo(21.3788f, 8.9081f, 21.3788f, 6.0935f, 19.6428f, 4.3576f)
                close()
            }
        }
            .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
