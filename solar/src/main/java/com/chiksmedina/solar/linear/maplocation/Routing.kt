package com.chiksmedina.solar.linear.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.linear.MapLocationGroup

public val MapLocationGroup.Routing: ImageVector
    get() {
        if (_routing != null) {
            return _routing!!
        }
        _routing = Builder(name = "Routing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                lineTo(20.5303f, 19.5303f)
                curveTo(20.8232f, 19.2374f, 20.8232f, 18.7626f, 20.5303f, 18.4697f)
                lineTo(20.0f, 19.0f)
                close()
                moveTo(8.0f, 4.25f)
                curveTo(7.5858f, 4.25f, 7.25f, 4.5858f, 7.25f, 5.0f)
                curveTo(7.25f, 5.4142f, 7.5858f, 5.75f, 8.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(18.5303f, 16.4697f)
                curveTo(18.2374f, 16.1768f, 17.7626f, 16.1768f, 17.4697f, 16.4697f)
                curveTo(17.1768f, 16.7626f, 17.1768f, 17.2374f, 17.4697f, 17.5303f)
                lineTo(18.5303f, 16.4697f)
                close()
                moveTo(17.4697f, 20.4697f)
                curveTo(17.1768f, 20.7626f, 17.1768f, 21.2374f, 17.4697f, 21.5303f)
                curveTo(17.7626f, 21.8232f, 18.2374f, 21.8232f, 18.5303f, 21.5303f)
                lineTo(17.4697f, 20.4697f)
                close()
                moveTo(20.0f, 18.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(19.75f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.25f)
                close()
                moveTo(7.5f, 12.75f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(12.75f)
                close()
                moveTo(16.5f, 4.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(16.5f)
                verticalLineTo(4.25f)
                close()
                moveTo(20.5303f, 18.4697f)
                lineTo(18.5303f, 16.4697f)
                lineTo(17.4697f, 17.5303f)
                lineTo(19.4697f, 19.5303f)
                lineTo(20.5303f, 18.4697f)
                close()
                moveTo(19.4697f, 18.4697f)
                lineTo(17.4697f, 20.4697f)
                lineTo(18.5303f, 21.5303f)
                lineTo(20.5303f, 19.5303f)
                lineTo(19.4697f, 18.4697f)
                close()
                moveTo(20.75f, 8.5f)
                curveTo(20.75f, 6.1528f, 18.8472f, 4.25f, 16.5f, 4.25f)
                verticalLineTo(5.75f)
                curveTo(18.0188f, 5.75f, 19.25f, 6.9812f, 19.25f, 8.5f)
                horizontalLineTo(20.75f)
                close()
                moveTo(16.5f, 12.75f)
                curveTo(18.8472f, 12.75f, 20.75f, 10.8472f, 20.75f, 8.5f)
                horizontalLineTo(19.25f)
                curveTo(19.25f, 10.0188f, 18.0188f, 11.25f, 16.5f, 11.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(4.75f, 15.5f)
                curveTo(4.75f, 13.9812f, 5.9812f, 12.75f, 7.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(5.1528f, 11.25f, 3.25f, 13.1528f, 3.25f, 15.5f)
                horizontalLineTo(4.75f)
                close()
                moveTo(7.5f, 18.25f)
                curveTo(5.9812f, 18.25f, 4.75f, 17.0188f, 4.75f, 15.5f)
                horizontalLineTo(3.25f)
                curveTo(3.25f, 17.8472f, 5.1528f, 19.75f, 7.5f, 19.75f)
                verticalLineTo(18.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _routing!!
    }

private var _routing: ImageVector? = null
