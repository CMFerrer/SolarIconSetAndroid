package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(
            name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5359f, 6.9091f)
                curveTo(9.5359f, 5.8547f, 10.4868f, 5.0f, 11.6599f, 5.0f)
                curveTo(12.8329f, 5.0f, 13.7839f, 5.8547f, 13.7839f, 6.9091f)
                curveTo(13.7839f, 7.4053f, 13.6046f, 7.8573f, 13.2925f, 8.1968f)
                curveTo(12.6948f, 8.8471f, 11.8015f, 9.502f, 11.8015f, 10.3455f)
                verticalLineTo(10.6299f)
                moveTo(11.8015f, 10.6299f)
                curveTo(12.533f, 10.6214f, 13.2674f, 10.8246f, 13.8845f, 11.2406f)
                lineTo(21.317f, 16.2509f)
                curveTo(22.6234f, 17.1315f, 21.9305f, 19.0f, 20.2975f, 19.0f)
                horizontalLineTo(3.7025f)
                curveTo(2.0872f, 19.0f, 1.3832f, 17.1648f, 2.6553f, 16.27f)
                lineTo(9.751f, 11.2787f)
                curveTo(10.3534f, 10.855f, 11.076f, 10.6383f, 11.8015f, 10.6299f)
                close()
            }
        }
            .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null
