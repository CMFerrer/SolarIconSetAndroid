package com.chiksmedina.solar.bold.buildinginfrastructure

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BuildingInfrastructureGroup

public val BuildingInfrastructureGroup.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0069f, 9.105f)
                lineTo(10.0069f, 3.7717f)
                curveTo(11.1436f, 2.7613f, 12.8564f, 2.7613f, 13.9931f, 3.7717f)
                lineTo(19.9931f, 9.105f)
                curveTo(20.6336f, 9.6743f, 21.0f, 10.4903f, 21.0f, 11.3472f)
                verticalLineTo(21.2501f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 21.2501f, 22.75f, 21.5858f, 22.75f, 22.0001f)
                curveTo(22.75f, 22.4143f, 22.4142f, 22.7501f, 22.0f, 22.7501f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 22.7501f, 1.25f, 22.4143f, 1.25f, 22.0001f)
                curveTo(1.25f, 21.5858f, 1.5858f, 21.2501f, 2.0f, 21.2501f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.3472f)
                curveTo(3.0f, 10.4903f, 3.3664f, 9.6743f, 4.0069f, 9.105f)
                close()
                moveTo(9.25f, 9.0f)
                curveTo(9.25f, 8.5858f, 9.5858f, 8.25f, 10.0f, 8.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 8.25f, 14.75f, 8.5858f, 14.75f, 9.0f)
                curveTo(14.75f, 9.4143f, 14.4142f, 9.75f, 14.0f, 9.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 9.75f, 9.25f, 9.4143f, 9.25f, 9.0f)
                close()
                moveTo(14.052f, 11.25f)
                curveTo(14.9505f, 11.25f, 15.6997f, 11.25f, 16.2945f, 11.33f)
                curveTo(16.9223f, 11.4144f, 17.4891f, 11.6f, 17.9445f, 12.0555f)
                curveTo(18.4f, 12.511f, 18.5857f, 13.0778f, 18.6701f, 13.7056f)
                curveTo(18.7501f, 14.3004f, 18.75f, 15.0496f, 18.75f, 15.9481f)
                lineTo(18.75f, 21.2501f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.0001f)
                curveTo(17.25f, 15.036f, 17.2484f, 14.3885f, 17.1835f, 13.9054f)
                curveTo(17.1214f, 13.444f, 17.0142f, 13.2465f, 16.8839f, 13.1162f)
                curveTo(16.7536f, 12.9859f, 16.5561f, 12.8786f, 16.0946f, 12.8166f)
                curveTo(15.6116f, 12.7516f, 14.964f, 12.7501f, 14.0f, 12.7501f)
                horizontalLineTo(10.0f)
                curveTo(9.036f, 12.7501f, 8.3884f, 12.7516f, 7.9054f, 12.8166f)
                curveTo(7.4439f, 12.8786f, 7.2464f, 12.9859f, 7.1161f, 13.1162f)
                curveTo(6.9858f, 13.2465f, 6.8786f, 13.444f, 6.8165f, 13.9054f)
                curveTo(6.7516f, 14.3885f, 6.75f, 15.036f, 6.75f, 16.0001f)
                verticalLineTo(21.2501f)
                horizontalLineTo(5.25f)
                lineTo(5.25f, 15.9481f)
                curveTo(5.25f, 15.0496f, 5.2499f, 14.3004f, 5.3299f, 13.7056f)
                curveTo(5.4143f, 13.0778f, 5.6f, 12.511f, 6.0555f, 12.0555f)
                curveTo(6.5109f, 11.6f, 7.0777f, 11.4144f, 7.7055f, 11.33f)
                curveTo(8.3003f, 11.25f, 9.0495f, 11.25f, 9.948f, 11.25f)
                horizontalLineTo(14.052f)
                close()
                moveTo(8.25f, 15.5001f)
                curveTo(8.25f, 15.0858f, 8.5858f, 14.7501f, 9.0f, 14.7501f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 14.7501f, 15.75f, 15.0858f, 15.75f, 15.5001f)
                curveTo(15.75f, 15.9143f, 15.4142f, 16.2501f, 15.0f, 16.2501f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 16.2501f, 8.25f, 15.9143f, 8.25f, 15.5001f)
                close()
                moveTo(8.25f, 18.5001f)
                curveTo(8.25f, 18.0858f, 8.5858f, 17.7501f, 9.0f, 17.7501f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 17.7501f, 15.75f, 18.0858f, 15.75f, 18.5001f)
                curveTo(15.75f, 18.9143f, 15.4142f, 19.2501f, 15.0f, 19.2501f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 19.2501f, 8.25f, 18.9143f, 8.25f, 18.5001f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
