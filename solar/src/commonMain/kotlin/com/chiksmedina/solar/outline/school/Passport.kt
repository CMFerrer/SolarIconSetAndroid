package com.chiksmedina.solar.outline.school

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
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(
            name = "Passport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 9.2501f)
                curveTo(9.9289f, 9.2501f, 8.25f, 10.9291f, 8.25f, 13.0001f)
                curveTo(8.25f, 15.0712f, 9.9289f, 16.7501f, 12.0f, 16.7501f)
                curveTo(14.0711f, 16.7501f, 15.75f, 15.0712f, 15.75f, 13.0001f)
                curveTo(15.75f, 10.9291f, 14.0711f, 9.2501f, 12.0f, 9.2501f)
                close()
                moveTo(9.75f, 13.0001f)
                curveTo(9.75f, 11.7575f, 10.7574f, 10.7501f, 12.0f, 10.7501f)
                curveTo(13.2426f, 10.7501f, 14.25f, 11.7575f, 14.25f, 13.0001f)
                curveTo(14.25f, 14.2428f, 13.2426f, 15.2501f, 12.0f, 15.2501f)
                curveTo(10.7574f, 15.2501f, 9.75f, 14.2428f, 9.75f, 13.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 18.2501f)
                curveTo(9.5858f, 18.2501f, 9.25f, 18.5859f, 9.25f, 19.0001f)
                curveTo(9.25f, 19.4144f, 9.5858f, 19.7501f, 10.0f, 19.7501f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 19.7501f, 14.75f, 19.4144f, 14.75f, 19.0001f)
                curveTo(14.75f, 18.5859f, 14.4142f, 18.2501f, 14.0f, 18.2501f)
                horizontalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6111f, 1.5838f)
                curveTo(17.2678f, 1.3471f, 18.75f, 2.6327f, 18.75f, 4.3062f)
                verticalLineTo(5.6827f)
                curveTo(19.9395f, 6.3114f, 20.75f, 7.5611f, 20.75f, 9.0001f)
                verticalLineTo(19.0001f)
                curveTo(20.75f, 21.0712f, 19.0711f, 22.7501f, 17.0f, 22.7501f)
                horizontalLineTo(7.0f)
                curveTo(4.9289f, 22.7501f, 3.25f, 21.0712f, 3.25f, 19.0001f)
                verticalLineTo(5.0001f)
                horizontalLineTo(3.2514f)
                curveTo(3.2505f, 4.9766f, 3.25f, 4.9529f, 3.25f, 4.9291f)
                curveTo(3.25f, 4.0228f, 3.9164f, 3.2545f, 4.8135f, 3.1263f)
                lineTo(15.6111f, 1.5838f)
                close()
                moveTo(5.0711f, 6.7502f)
                lineTo(5.0624f, 6.7501f)
                horizontalLineTo(4.75f)
                verticalLineTo(19.0001f)
                curveTo(4.75f, 20.2428f, 5.7574f, 21.2501f, 7.0f, 21.2501f)
                horizontalLineTo(17.0f)
                curveTo(18.2426f, 21.2501f, 19.25f, 20.2428f, 19.25f, 19.0001f)
                verticalLineTo(9.0001f)
                curveTo(19.25f, 7.7607f, 18.2478f, 6.7553f, 17.0096f, 6.7502f)
                horizontalLineTo(5.0711f)
                close()
                moveTo(17.25f, 5.2502f)
                horizontalLineTo(17.0125f)
                lineTo(17.0f, 5.2501f)
                horizontalLineTo(5.0674f)
                curveTo(4.8918f, 5.2482f, 4.75f, 5.1052f, 4.75f, 4.9291f)
                curveTo(4.75f, 4.7693f, 4.8675f, 4.6339f, 5.0257f, 4.6112f)
                lineTo(15.8232f, 3.0687f)
                curveTo(16.5763f, 2.9612f, 17.25f, 3.5455f, 17.25f, 4.3062f)
                verticalLineTo(5.2502f)
                close()
            }
        }
            .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
