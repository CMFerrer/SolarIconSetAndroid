package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                verticalLineTo(18.5f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(18.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 14.0681f, 2.0f, 13.6022f, 2.1522f, 13.2346f)
                curveTo(2.3552f, 12.7446f, 2.7446f, 12.3552f, 3.2346f, 12.1522f)
                curveTo(3.6022f, 12.0f, 4.0681f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9319f, 12.0f, 20.3978f, 12.0f, 20.7654f, 12.1522f)
                curveTo(21.2554f, 12.3552f, 21.6448f, 12.7446f, 21.8478f, 13.2346f)
                curveTo(22.0f, 13.6022f, 22.0f, 14.0681f, 22.0f, 15.0f)
                curveTo(22.0f, 15.9319f, 22.0f, 16.3978f, 21.8478f, 16.7654f)
                curveTo(21.6448f, 17.2554f, 21.2554f, 17.6448f, 20.7654f, 17.8478f)
                curveTo(20.3978f, 18.0f, 19.9319f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(5.0f)
                curveTo(4.0681f, 18.0f, 3.6022f, 18.0f, 3.2346f, 17.8478f)
                curveTo(2.7446f, 17.6448f, 2.3552f, 17.2554f, 2.1522f, 16.7654f)
                curveTo(2.0f, 16.3978f, 2.0f, 15.9319f, 2.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 8.2288f, 21.0f, 6.3432f, 19.8284f, 5.1716f)
                curveTo(18.6569f, 4.0f, 16.7712f, 4.0f, 13.0f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 4.0f, 5.3432f, 4.0f, 4.1716f, 5.1716f)
                curveTo(3.0f, 6.3432f, 3.0f, 8.2288f, 3.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                verticalLineTo(10.5f)
                curveTo(18.5f, 8.6144f, 18.5f, 7.6716f, 17.9142f, 7.0858f)
                curveTo(17.3284f, 6.5f, 16.3856f, 6.5f, 14.5f, 6.5f)
                horizontalLineTo(9.5f)
                curveTo(7.6144f, 6.5f, 6.6716f, 6.5f, 6.0858f, 7.0858f)
                curveTo(5.5f, 7.6716f, 5.5f, 8.6144f, 5.5f, 10.5f)
                verticalLineTo(12.0f)
                moveTo(12.0f, 7.0f)
                verticalLineTo(12.0f)
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
