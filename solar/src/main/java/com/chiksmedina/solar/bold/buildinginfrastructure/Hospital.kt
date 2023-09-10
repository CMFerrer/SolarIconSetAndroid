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

val BuildingInfrastructureGroup.Hospital: ImageVector
    get() {
        if (_hospital != null) {
            return _hospital!!
        }
        _hospital = Builder(
            name = "Hospital", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.5f, 8.5f)
                curveTo(21.5f, 7.0955f, 21.5f, 6.3933f, 21.1629f, 5.8889f)
                curveTo(21.017f, 5.6705f, 20.8295f, 5.483f, 20.6111f, 5.3371f)
                curveTo(20.1699f, 5.0422f, 19.5774f, 5.0053f, 18.496f, 5.0007f)
                curveTo(18.5001f, 5.2921f, 18.5f, 5.5965f, 18.5f, 5.9105f)
                lineTo(18.5f, 6.0f)
                verticalLineTo(7.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 7.25f, 20.25f, 7.5858f, 20.25f, 8.0f)
                curveTo(20.25f, 8.4142f, 19.9142f, 8.75f, 19.5f, 8.75f)
                horizontalLineTo(18.5f)
                verticalLineTo(10.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 10.25f, 20.25f, 10.5858f, 20.25f, 11.0f)
                curveTo(20.25f, 11.4142f, 19.9142f, 11.75f, 19.5f, 11.75f)
                horizontalLineTo(18.5f)
                verticalLineTo(13.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 13.25f, 20.25f, 13.5858f, 20.25f, 14.0f)
                curveTo(20.25f, 14.4142f, 19.9142f, 14.75f, 19.5f, 14.75f)
                horizontalLineTo(18.5f)
                verticalLineTo(21.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.1144f, 17.0f, 3.1716f, 16.4142f, 2.5858f)
                curveTo(15.8284f, 2.0f, 14.8856f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 2.0f, 8.1716f, 2.0f, 7.5858f, 2.5858f)
                curveTo(7.0f, 3.1716f, 7.0f, 4.1144f, 7.0f, 6.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.75f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 14.75f, 3.75f, 14.4142f, 3.75f, 14.0f)
                curveTo(3.75f, 13.5858f, 4.0858f, 13.25f, 4.5f, 13.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(11.75f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 11.75f, 3.75f, 11.4142f, 3.75f, 11.0f)
                curveTo(3.75f, 10.5858f, 4.0858f, 10.25f, 4.5f, 10.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(8.75f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 8.75f, 3.75f, 8.4142f, 3.75f, 8.0f)
                curveTo(3.75f, 7.5858f, 4.0858f, 7.25f, 4.5f, 7.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(6.0f)
                lineTo(5.5f, 5.9105f)
                curveTo(5.5f, 5.5965f, 5.4999f, 5.2921f, 5.504f, 5.0007f)
                curveTo(4.4226f, 5.0053f, 3.8301f, 5.0422f, 3.3889f, 5.3371f)
                curveTo(3.1705f, 5.483f, 2.983f, 5.6705f, 2.8371f, 5.8889f)
                curveTo(2.5f, 6.3933f, 2.5f, 7.0955f, 2.5f, 8.5f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(21.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(12.0f, 4.25f)
                curveTo(12.4142f, 4.25f, 12.75f, 4.5858f, 12.75f, 5.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 6.25f, 14.75f, 6.5858f, 14.75f, 7.0f)
                curveTo(14.75f, 7.4142f, 14.4142f, 7.75f, 14.0f, 7.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0f)
                curveTo(12.75f, 9.4142f, 12.4142f, 9.75f, 12.0f, 9.75f)
                curveTo(11.5858f, 9.75f, 11.25f, 9.4142f, 11.25f, 9.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 7.75f, 9.25f, 7.4142f, 9.25f, 7.0f)
                curveTo(9.25f, 6.5858f, 9.5858f, 6.25f, 10.0f, 6.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                close()
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.25f, 14.75f, 11.5858f, 14.75f, 12.0f)
                curveTo(14.75f, 12.4142f, 14.4142f, 12.75f, 14.0f, 12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 12.75f, 9.25f, 12.4142f, 9.25f, 12.0f)
                close()
                moveTo(9.25f, 15.0f)
                curveTo(9.25f, 14.5858f, 9.5858f, 14.25f, 10.0f, 14.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 14.25f, 14.75f, 14.5858f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4142f, 14.4142f, 15.75f, 14.0f, 15.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 15.75f, 9.25f, 15.4142f, 9.25f, 15.0f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 18.5858f, 12.75f, 19.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                close()
            }
        }
            .build()
        return _hospital!!
    }

private var _hospital: ImageVector? = null
