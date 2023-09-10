package com.chiksmedina.solar.linear.buildinginfrastructure

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.BuildingInfrastructureGroup

val BuildingInfrastructureGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(
            name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 22.0001f)
                verticalLineTo(11.3472f)
                curveTo(3.0f, 10.4903f, 3.3664f, 9.6743f, 4.0069f, 9.105f)
                lineTo(10.0069f, 3.7717f)
                curveTo(11.1436f, 2.7613f, 12.8564f, 2.7613f, 13.9931f, 3.7717f)
                lineTo(19.9931f, 9.105f)
                curveTo(20.6336f, 9.6743f, 21.0f, 10.4903f, 21.0f, 11.3472f)
                verticalLineTo(22.0001f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 9.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 15.5f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 18.5f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 14.1144f, 18.0f, 13.1716f, 17.4142f, 12.5858f)
                curveTo(16.8284f, 12.0f, 15.8856f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(10.0f)
                curveTo(8.1144f, 12.0f, 7.1716f, 12.0f, 6.5858f, 12.5858f)
                curveTo(6.0f, 13.1716f, 6.0f, 14.1144f, 6.0f, 16.0f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
