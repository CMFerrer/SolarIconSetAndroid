package com.chiksmedina.solar.bold.buildinginfrastructure

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BuildingInfrastructureGroup

val BuildingInfrastructureGroup.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(
            name = "City", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.7071f, 4.7929f)
                curveTo(9.4142f, 4.5f, 8.9428f, 4.5f, 8.0f, 4.5f)
                horizontalLineTo(7.75f)
                verticalLineTo(3.0f)
                curveTo(7.75f, 2.5858f, 7.4142f, 2.25f, 7.0f, 2.25f)
                curveTo(6.5858f, 2.25f, 6.25f, 2.5858f, 6.25f, 3.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 4.5f, 4.5858f, 4.5f, 4.2929f, 4.7929f)
                curveTo(4.0f, 5.0858f, 4.0f, 5.5572f, 4.0f, 6.5f)
                verticalLineTo(6.7038f)
                curveTo(4.2025f, 6.6506f, 4.4056f, 6.6135f, 4.6056f, 6.5866f)
                curveTo(5.2512f, 6.4998f, 6.0449f, 6.4999f, 6.9105f, 6.5f)
                horizontalLineTo(7.0895f)
                curveTo(7.9551f, 6.4999f, 8.7488f, 6.4998f, 9.3944f, 6.5866f)
                curveTo(9.5944f, 6.6135f, 9.7975f, 6.6506f, 10.0f, 6.7038f)
                lineTo(10.0f, 6.5f)
                curveTo(10.0f, 5.5572f, 10.0f, 5.0858f, 9.7071f, 4.7929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 21.25f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.7719f)
                curveTo(21.0f, 6.4311f, 21.0f, 5.7607f, 20.6439f, 5.2468f)
                curveTo(20.2877f, 4.7328f, 19.66f, 4.4974f, 18.4045f, 4.0266f)
                curveTo(15.9492f, 3.1059f, 14.7216f, 2.6456f, 13.8608f, 3.2421f)
                curveTo(13.0f, 3.8386f, 13.0f, 5.1497f, 13.0f, 7.7719f)
                verticalLineTo(10.5f)
                lineTo(13.0895f, 10.5f)
                curveTo(13.9551f, 10.4999f, 14.7488f, 10.4998f, 15.3944f, 10.5866f)
                curveTo(16.1054f, 10.6822f, 16.8568f, 10.9071f, 17.4749f, 11.5251f)
                curveTo(18.0929f, 12.1432f, 18.3178f, 12.8946f, 18.4134f, 13.6056f)
                curveTo(18.5002f, 14.2512f, 18.5001f, 15.0449f, 18.5f, 15.9105f)
                lineTo(18.5f, 16.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                curveTo(17.0f, 14.1144f, 17.0f, 13.1716f, 16.4142f, 12.5858f)
                curveTo(15.8284f, 12.0f, 14.8856f, 12.0f, 13.0f, 12.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 12.0f, 8.1716f, 12.0f, 7.5858f, 12.5858f)
                curveTo(7.0f, 13.1716f, 7.0f, 14.1144f, 7.0f, 16.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(16.0f)
                lineTo(5.5f, 15.9105f)
                curveTo(5.4999f, 15.0449f, 5.4998f, 14.2512f, 5.5866f, 13.6056f)
                curveTo(5.6822f, 12.8946f, 5.9071f, 12.1432f, 6.5251f, 11.5251f)
                curveTo(7.1432f, 10.9071f, 7.8946f, 10.6822f, 8.6056f, 10.5866f)
                curveTo(9.2512f, 10.4998f, 10.0449f, 10.4999f, 10.9105f, 10.5f)
                lineTo(10.9825f, 10.5f)
                curveTo(10.9436f, 9.5639f, 10.8183f, 8.9899f, 10.4142f, 8.5858f)
                curveTo(9.8284f, 8.0f, 8.8856f, 8.0f, 7.0f, 8.0f)
                curveTo(5.1144f, 8.0f, 4.1716f, 8.0f, 3.5858f, 8.5858f)
                curveTo(3.0f, 9.1716f, 3.0f, 10.1144f, 3.0f, 12.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                close()
                moveTo(9.25f, 15.0f)
                curveTo(9.25f, 14.5858f, 9.5858f, 14.25f, 10.0f, 14.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 14.25f, 14.75f, 14.5858f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4142f, 14.4142f, 15.75f, 14.0f, 15.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 15.75f, 9.25f, 15.4142f, 9.25f, 15.0f)
                close()
                moveTo(9.25f, 18.0f)
                curveTo(9.25f, 17.5858f, 9.5858f, 17.25f, 10.0f, 17.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 17.25f, 14.75f, 17.5858f, 14.75f, 18.0f)
                curveTo(14.75f, 18.4142f, 14.4142f, 18.75f, 14.0f, 18.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 18.75f, 9.25f, 18.4142f, 9.25f, 18.0f)
                close()
            }
        }
            .build()
        return _city!!
    }

private var _city: ImageVector? = null
