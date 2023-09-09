package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.StreetsMapPoint: ImageVector
    get() {
        if (_streetsMapPoint != null) {
            return _streetsMapPoint!!
        }
        _streetsMapPoint = Builder(name = "StreetsMapPoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 8.7573f)
                curveTo(5.5f, 6.9584f, 7.067f, 5.5f, 9.0f, 5.5f)
                curveTo(10.933f, 5.5f, 12.5f, 6.9584f, 12.5f, 8.7573f)
                curveTo(12.5f, 10.5422f, 11.3829f, 12.625f, 9.64f, 13.3698f)
                curveTo(9.2337f, 13.5434f, 8.7663f, 13.5434f, 8.36f, 13.3698f)
                curveTo(6.6171f, 12.625f, 5.5f, 10.5422f, 5.5f, 8.7573f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0004f, 13.9993f)
                lineTo(20.5004f, 20.4993f)
                moveTo(14.0004f, 13.9993f)
                lineTo(6.3945f, 21.6053f)
                moveTo(14.0004f, 13.9993f)
                lineTo(16.0f, 11.9998f)
                moveTo(21.6072f, 6.3926f)
                lineTo(19.0f, 8.9998f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                curveTo(10.0f, 9.5523f, 9.5523f, 10.0f, 9.0f, 10.0f)
                curveTo(8.4477f, 10.0f, 8.0f, 9.5523f, 8.0f, 9.0f)
                curveTo(8.0f, 8.4477f, 8.4477f, 8.0f, 9.0f, 8.0f)
                curveTo(9.5523f, 8.0f, 10.0f, 8.4477f, 10.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.4907f, 4.4382f, 2.1644f, 5.8066f, 2.0551f, 8.0f)
            }
        }
        .build()
        return _streetsMapPoint!!
    }

private var _streetsMapPoint: ImageVector? = null
