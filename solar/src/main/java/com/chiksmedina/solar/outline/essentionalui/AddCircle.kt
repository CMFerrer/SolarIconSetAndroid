package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.AddCircle: ImageVector
    get() {
        if (_addCircle != null) {
            return _addCircle!!
        }
        _addCircle = Builder(
            name = "AddCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 9.0f)
                curveTo(12.75f, 8.5858f, 12.4142f, 8.25f, 12.0f, 8.25f)
                curveTo(11.5858f, 8.25f, 11.25f, 8.5858f, 11.25f, 9.0f)
                lineTo(11.25f, 11.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 11.25f, 8.25f, 11.5858f, 8.25f, 12.0f)
                curveTo(8.25f, 12.4142f, 8.5858f, 12.75f, 9.0f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 15.4142f, 11.5858f, 15.75f, 12.0f, 15.75f)
                curveTo(12.4142f, 15.75f, 12.75f, 15.4142f, 12.75f, 15.0f)
                lineTo(12.75f, 12.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 12.75f, 15.75f, 12.4142f, 15.75f, 12.0f)
                curveTo(15.75f, 11.5858f, 15.4142f, 11.25f, 15.0f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0f)
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
        return _addCircle!!
    }

private var _addCircle: ImageVector? = null
