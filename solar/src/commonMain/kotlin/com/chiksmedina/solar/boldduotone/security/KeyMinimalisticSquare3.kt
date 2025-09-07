package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.KeyMinimalisticSquare3: ImageVector
    get() {
        if (_keyMinimalisticSquare3 != null) {
            return _keyMinimalisticSquare3!!
        }
        _keyMinimalisticSquare3 = Builder(
            name = "KeyMinimalisticSquare3", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.663f, 11.25f)
                curveTo(11.3245f, 9.8167f, 10.0368f, 8.75f, 8.5f, 8.75f)
                curveTo(6.7051f, 8.75f, 5.25f, 10.2051f, 5.25f, 12.0f)
                curveTo(5.25f, 13.7949f, 6.7051f, 15.25f, 8.5f, 15.25f)
                curveTo(10.0368f, 15.25f, 11.3245f, 14.1834f, 11.663f, 12.75f)
                horizontalLineTo(14.75f)
                verticalLineTo(13.5f)
                curveTo(14.75f, 13.9142f, 15.0858f, 14.25f, 15.5f, 14.25f)
                curveTo(15.9142f, 14.25f, 16.25f, 13.9142f, 16.25f, 13.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(17.0f)
                curveTo(17.1381f, 12.75f, 17.25f, 12.8619f, 17.25f, 13.0f)
                verticalLineTo(14.0f)
                curveTo(17.25f, 14.4142f, 17.5858f, 14.75f, 18.0f, 14.75f)
                curveTo(18.4142f, 14.75f, 18.75f, 14.4142f, 18.75f, 14.0f)
                verticalLineTo(13.0f)
                curveTo(18.75f, 12.0335f, 17.9665f, 11.25f, 17.0f, 11.25f)
                horizontalLineTo(11.663f)
                close()
                moveTo(8.5f, 10.25f)
                curveTo(7.5335f, 10.25f, 6.75f, 11.0335f, 6.75f, 12.0f)
                curveTo(6.75f, 12.9665f, 7.5335f, 13.75f, 8.5f, 13.75f)
                curveTo(9.4665f, 13.75f, 10.25f, 12.9665f, 10.25f, 12.0f)
                curveTo(10.25f, 11.0335f, 9.4665f, 10.25f, 8.5f, 10.25f)
                close()
            }
        }
            .build()
        return _keyMinimalisticSquare3!!
    }

private var _keyMinimalisticSquare3: ImageVector? = null
