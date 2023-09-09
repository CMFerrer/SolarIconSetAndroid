package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.4846f, 12.25f)
                curveTo(2.4846f, 11.8358f, 2.8207f, 11.5f, 3.2352f, 11.5f)
                curveTo(8.6243f, 11.5f, 12.9929f, 15.8652f, 12.9929f, 21.25f)
                curveTo(12.9929f, 21.6642f, 12.6569f, 22.0f, 12.2423f, 22.0f)
                curveTo(11.8278f, 22.0f, 11.4917f, 21.6642f, 11.4917f, 21.25f)
                curveTo(11.4917f, 16.6937f, 7.7952f, 13.0f, 3.2352f, 13.0f)
                curveTo(2.8207f, 13.0f, 2.4846f, 12.6642f, 2.4846f, 12.25f)
                close()
                moveTo(3.2352f, 14.5f)
                curveTo(2.8207f, 14.5f, 2.4846f, 14.8358f, 2.4846f, 15.25f)
                curveTo(2.4846f, 15.6642f, 2.8207f, 16.0f, 3.2352f, 16.0f)
                curveTo(6.137f, 16.0f, 8.4894f, 18.3505f, 8.4894f, 21.25f)
                curveTo(8.4894f, 21.6642f, 8.8254f, 22.0f, 9.24f, 22.0f)
                curveTo(9.6545f, 22.0f, 9.9906f, 21.6642f, 9.9906f, 21.25f)
                curveTo(9.9906f, 17.5221f, 6.9661f, 14.5f, 3.2352f, 14.5f)
                close()
                moveTo(2.4846f, 18.25f)
                curveTo(2.4846f, 17.8358f, 2.8207f, 17.5f, 3.2352f, 17.5f)
                curveTo(5.3079f, 17.5f, 6.9882f, 19.1789f, 6.9882f, 21.25f)
                curveTo(6.9882f, 21.6642f, 6.6521f, 22.0f, 6.2376f, 22.0f)
                curveTo(5.8231f, 22.0f, 5.487f, 21.6642f, 5.487f, 21.25f)
                curveTo(5.487f, 20.0074f, 4.4789f, 19.0f, 3.2352f, 19.0f)
                curveTo(2.8207f, 19.0f, 2.4846f, 18.6642f, 2.4846f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 10.3685f)
                curveTo(2.3547f, 10.1355f, 2.7791f, 10.0f, 3.2352f, 10.0f)
                curveTo(9.4533f, 10.0f, 14.4941f, 15.0368f, 14.4941f, 21.25f)
                curveTo(14.4941f, 21.513f, 14.4489f, 21.7654f, 14.366f, 22.0f)
                curveTo(17.8933f, 21.9986f, 19.6942f, 21.9595f, 20.8275f, 20.7881f)
                curveTo(22.0f, 19.5763f, 22.0f, 17.6258f, 22.0f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(22.0f, 9.9155f, 22.0f, 8.7713f, 21.4804f, 7.8227f)
                curveTo(20.9608f, 6.8742f, 20.0115f, 6.2855f, 18.1129f, 5.1081f)
                lineTo(16.1113f, 3.8669f)
                curveTo(14.1044f, 2.6223f, 13.1009f, 2.0f, 11.9921f, 2.0f)
                curveTo(10.8833f, 2.0f, 9.8799f, 2.6223f, 7.8729f, 3.8669f)
                lineTo(5.8713f, 5.1081f)
                curveTo(3.9728f, 6.2855f, 3.0235f, 6.8742f, 2.5039f, 7.8227f)
                curveTo(2.1463f, 8.4755f, 2.0348f, 9.2211f, 2.0f, 10.3685f)
                close()
            }
        }
        .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
