package com.chiksmedina.solar.boldduotone.maplocation

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
import com.chiksmedina.solar.boldduotone.MapLocationGroup

public val MapLocationGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 8.5117f)
                curveTo(10.0735f, 8.5117f, 8.5117f, 10.0735f, 8.5117f, 12.0001f)
                curveTo(8.5117f, 13.9267f, 10.0735f, 15.4885f, 12.0001f, 15.4885f)
                curveTo(13.9267f, 15.4885f, 15.4885f, 13.9267f, 15.4885f, 12.0001f)
                curveTo(15.4885f, 10.0735f, 13.9267f, 8.5117f, 12.0001f, 8.5117f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(4.0347f)
                curveTo(11.4969f, 4.0117f, 11.7471f, 4.0f, 12.0f, 4.0f)
                curveTo(12.2529f, 4.0f, 12.5031f, 4.0117f, 12.75f, 4.0347f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9653f, 12.75f)
                curveTo(19.9883f, 12.5031f, 20.0f, 12.2529f, 20.0f, 12.0f)
                curveTo(20.0f, 11.7471f, 19.9883f, 11.4969f, 19.9653f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(19.9653f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 19.9653f)
                curveTo(11.4969f, 19.9883f, 11.7471f, 20.0f, 12.0f, 20.0f)
                curveTo(12.2529f, 20.0f, 12.5031f, 19.9883f, 12.75f, 19.9653f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(19.9653f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0347f, 11.25f)
                curveTo(4.0117f, 11.4969f, 4.0f, 11.7471f, 4.0f, 12.0f)
                curveTo(4.0f, 12.2529f, 4.0117f, 12.5031f, 4.0347f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0347f)
                close()
            }
        }
        .build()
        return _gps!!
    }

private var _gps: ImageVector? = null
