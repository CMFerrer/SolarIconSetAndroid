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

val BuildingInfrastructureGroup.Buildings: ImageVector
    get() {
        if (_buildings != null) {
            return _buildings!!
        }
        _buildings = Builder(
            name = "Buildings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.8856f, 2.0f, 19.8284f, 2.0f, 20.4142f, 2.5858f)
                curveTo(21.0f, 3.1716f, 21.0f, 4.1144f, 21.0f, 6.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 21.25f, 22.75f, 21.5858f, 22.75f, 22.0f)
                curveTo(22.75f, 22.4142f, 22.4142f, 22.75f, 22.0f, 22.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 22.75f, 1.25f, 22.4142f, 1.25f, 22.0f)
                curveTo(1.25f, 21.5858f, 1.5858f, 21.25f, 2.0f, 21.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 7.1144f, 3.0f, 6.1716f, 3.5858f, 5.5858f)
                curveTo(4.1716f, 5.0f, 5.1144f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(12.8856f, 5.0f, 13.8284f, 5.0f, 14.4142f, 5.5858f)
                curveTo(15.0f, 6.1716f, 15.0f, 7.1144f, 15.0f, 9.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(16.5f)
                verticalLineTo(9.0f)
                lineTo(16.5f, 8.9105f)
                curveTo(16.5001f, 8.0449f, 16.5002f, 7.2512f, 16.4134f, 6.6056f)
                curveTo(16.3178f, 5.8946f, 16.0929f, 5.1432f, 15.4749f, 4.5251f)
                curveTo(14.8568f, 3.9071f, 14.1054f, 3.6822f, 13.3944f, 3.5866f)
                curveTo(12.7579f, 3.501f, 11.9774f, 3.4999f, 11.126f, 3.5f)
                curveTo(11.2103f, 3.1128f, 11.351f, 2.8206f, 11.5858f, 2.5858f)
                curveTo(12.1716f, 2.0f, 13.1144f, 2.0f, 15.0f, 2.0f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(5.25f, 7.5858f, 5.5858f, 7.25f, 6.0f, 7.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                curveTo(12.75f, 8.4142f, 12.4142f, 8.75f, 12.0f, 8.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 8.75f, 5.25f, 8.4142f, 5.25f, 8.0f)
                close()
                moveTo(5.25f, 11.0f)
                curveTo(5.25f, 10.5858f, 5.5858f, 10.25f, 6.0f, 10.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 10.25f, 12.75f, 10.5858f, 12.75f, 11.0f)
                curveTo(12.75f, 11.4142f, 12.4142f, 11.75f, 12.0f, 11.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.75f, 5.25f, 11.4142f, 5.25f, 11.0f)
                close()
                moveTo(5.25f, 14.0f)
                curveTo(5.25f, 13.5858f, 5.5858f, 13.25f, 6.0f, 13.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 13.25f, 12.75f, 13.5858f, 12.75f, 14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 14.75f, 5.25f, 14.4142f, 5.25f, 14.0f)
                close()
                moveTo(9.0f, 18.25f)
                curveTo(9.4142f, 18.25f, 9.75f, 18.5858f, 9.75f, 19.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.0f)
                curveTo(8.25f, 18.5858f, 8.5858f, 18.25f, 9.0f, 18.25f)
                close()
            }
        }
            .build()
        return _buildings!!
    }

private var _buildings: ImageVector? = null
