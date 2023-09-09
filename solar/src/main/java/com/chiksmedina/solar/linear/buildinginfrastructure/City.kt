package com.chiksmedina.solar.linear.buildinginfrastructure

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
import com.chiksmedina.solar.linear.BuildingInfrastructureGroup

public val BuildingInfrastructureGroup.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(name = "City", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 10.1144f, 3.0f, 9.1716f, 3.5858f, 8.5858f)
                curveTo(4.1716f, 8.0f, 5.1144f, 8.0f, 7.0f, 8.0f)
                curveTo(8.8856f, 8.0f, 9.8284f, 8.0f, 10.4142f, 8.5858f)
                curveTo(11.0f, 9.1716f, 11.0f, 10.1144f, 11.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(17.0f, 14.1144f, 17.0f, 13.1716f, 16.4142f, 12.5858f)
                curveTo(15.8284f, 12.0f, 14.8856f, 12.0f, 13.0f, 12.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 12.0f, 8.1716f, 12.0f, 7.5858f, 12.5858f)
                curveTo(7.0f, 13.1716f, 7.0f, 14.1144f, 7.0f, 16.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 21.9999f)
                verticalLineTo(7.7719f)
                curveTo(21.0f, 6.4311f, 21.0f, 5.7607f, 20.6439f, 5.2468f)
                curveTo(20.2877f, 4.7328f, 19.66f, 4.4974f, 18.4045f, 4.0266f)
                curveTo(15.9492f, 3.1059f, 14.7216f, 2.6456f, 13.8608f, 3.2421f)
                curveTo(13.0f, 3.8386f, 13.0f, 5.1497f, 13.0f, 7.7719f)
                verticalLineTo(11.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 5.5572f, 4.0f, 5.0858f, 4.2929f, 4.7929f)
                curveTo(4.5858f, 4.5f, 5.0572f, 4.5f, 6.0f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(8.9428f, 4.5f, 9.4142f, 4.5f, 9.7071f, 4.7929f)
                curveTo(10.0f, 5.0858f, 10.0f, 5.5572f, 10.0f, 6.5f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _city!!
    }

private var _city: ImageVector? = null
