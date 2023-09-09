package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.MinusCircle: ImageVector
    get() {
        if (_minusCircle != null) {
            return _minusCircle!!
        }
        _minusCircle = Builder(name = "MinusCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(15.75f, 12.0f)
                curveTo(15.75f, 12.4142f, 15.4142f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 12.75f, 8.25f, 12.4142f, 8.25f, 12.0f)
                curveTo(8.25f, 11.5858f, 8.5858f, 11.25f, 9.0f, 11.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 11.25f, 15.75f, 11.5858f, 15.75f, 12.0f)
                close()
            }
        }
        .build()
        return _minusCircle!!
    }

private var _minusCircle: ImageVector? = null
