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

val EssentionalUiGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(
            name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                curveTo(16.4183f, 10.0f, 20.0f, 8.2091f, 20.0f, 6.0f)
                curveTo(20.0f, 3.7909f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 3.7909f, 4.0f, 6.0f)
                curveTo(4.0f, 8.2091f, 7.5817f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 20.2091f, 7.5817f, 22.0f, 12.0f, 22.0f)
                curveTo(16.4183f, 22.0f, 20.0f, 20.2091f, 20.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 14.2091f, 16.4183f, 16.0f, 12.0f, 16.0f)
                curveTo(7.5817f, 16.0f, 4.0f, 14.2091f, 4.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 14.2091f, 7.5817f, 16.0f, 12.0f, 16.0f)
                curveTo(16.4183f, 16.0f, 20.0f, 14.2091f, 20.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 8.2091f, 16.4183f, 10.0f, 12.0f, 10.0f)
                curveTo(7.5817f, 10.0f, 4.0f, 8.2091f, 4.0f, 6.0f)
                close()
            }
        }
            .build()
        return _database!!
    }

private var _database: ImageVector? = null
