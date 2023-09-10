package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.PassportMinimalistic: ImageVector
    get() {
        if (_passportMinimalistic != null) {
            return _passportMinimalistic!!
        }
        _passportMinimalistic = Builder(
            name = "PassportMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 14.0001f)
                curveTo(8.25f, 11.9291f, 9.9289f, 10.2501f, 12.0f, 10.2501f)
                curveTo(14.0711f, 10.2501f, 15.75f, 11.9291f, 15.75f, 14.0001f)
                curveTo(15.75f, 16.0712f, 14.0711f, 17.7501f, 12.0f, 17.7501f)
                curveTo(9.9289f, 17.7501f, 8.25f, 16.0712f, 8.25f, 14.0001f)
                close()
                moveTo(12.0f, 11.7501f)
                curveTo(10.7574f, 11.7501f, 9.75f, 12.7575f, 9.75f, 14.0001f)
                curveTo(9.75f, 15.2428f, 10.7574f, 16.2501f, 12.0f, 16.2501f)
                curveTo(13.2426f, 16.2501f, 14.25f, 15.2428f, 14.25f, 14.0001f)
                curveTo(14.25f, 12.7575f, 13.2426f, 11.7501f, 12.0f, 11.7501f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.75f, 4.3062f)
                curveTo(18.75f, 2.6327f, 17.2678f, 1.3471f, 15.6111f, 1.5838f)
                lineTo(4.8135f, 3.1263f)
                curveTo(3.9164f, 3.2545f, 3.25f, 4.0228f, 3.25f, 4.9291f)
                curveTo(3.25f, 4.9529f, 3.2505f, 4.9766f, 3.2514f, 5.0001f)
                horizontalLineTo(3.25f)
                verticalLineTo(19.0001f)
                curveTo(3.25f, 21.0712f, 4.9289f, 22.7501f, 7.0f, 22.7501f)
                horizontalLineTo(17.0f)
                curveTo(19.0711f, 22.7501f, 20.75f, 21.0712f, 20.75f, 19.0001f)
                verticalLineTo(9.0001f)
                curveTo(20.75f, 7.5611f, 19.9395f, 6.3114f, 18.75f, 5.6827f)
                verticalLineTo(4.3062f)
                close()
                moveTo(5.0624f, 6.7501f)
                curveTo(5.0653f, 6.7502f, 5.0682f, 6.7502f, 5.0711f, 6.7502f)
                horizontalLineTo(17.0096f)
                curveTo(18.2478f, 6.7553f, 19.25f, 7.7607f, 19.25f, 9.0001f)
                verticalLineTo(19.0001f)
                curveTo(19.25f, 20.2428f, 18.2426f, 21.2501f, 17.0f, 21.2501f)
                horizontalLineTo(7.0f)
                curveTo(5.7574f, 21.2501f, 4.75f, 20.2428f, 4.75f, 19.0001f)
                verticalLineTo(6.7501f)
                horizontalLineTo(5.0624f)
                close()
                moveTo(17.0125f, 5.2502f)
                horizontalLineTo(17.25f)
                verticalLineTo(4.3062f)
                curveTo(17.25f, 3.5455f, 16.5763f, 2.9612f, 15.8232f, 3.0687f)
                lineTo(5.0257f, 4.6112f)
                curveTo(4.8675f, 4.6339f, 4.75f, 4.7693f, 4.75f, 4.9291f)
                curveTo(4.75f, 5.1052f, 4.8918f, 5.2482f, 5.0674f, 5.2501f)
                horizontalLineTo(17.0f)
                curveTo(17.0042f, 5.2501f, 17.0084f, 5.2502f, 17.0125f, 5.2502f)
                close()
            }
        }
            .build()
        return _passportMinimalistic!!
    }

private var _passportMinimalistic: ImageVector? = null
