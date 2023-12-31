package com.chiksmedina.solar.outline.security

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
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.LockKeyholeMinimalistic: ImageVector
    get() {
        if (_lockKeyholeMinimalistic != null) {
            return _lockKeyholeMinimalistic!!
        }
        _lockKeyholeMinimalistic = Builder(
            name = "LockKeyholeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.25f)
                curveTo(12.4142f, 13.25f, 12.75f, 13.5858f, 12.75f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(11.25f, 13.5858f, 11.5858f, 13.25f, 12.0f, 13.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 9.3028f)
                verticalLineTo(8.0f)
                curveTo(5.25f, 4.2721f, 8.2721f, 1.25f, 12.0f, 1.25f)
                curveTo(15.7279f, 1.25f, 18.75f, 4.2721f, 18.75f, 8.0f)
                verticalLineTo(9.3028f)
                curveTo(18.9768f, 9.3187f, 19.1906f, 9.3395f, 19.3918f, 9.3665f)
                curveTo(20.2919f, 9.4875f, 21.0497f, 9.7464f, 21.6517f, 10.3483f)
                curveTo(22.2536f, 10.9503f, 22.5125f, 11.7081f, 22.6335f, 12.6082f)
                curveTo(22.75f, 13.4752f, 22.75f, 14.5775f, 22.75f, 15.9451f)
                verticalLineTo(16.0549f)
                curveTo(22.75f, 17.4225f, 22.75f, 18.5248f, 22.6335f, 19.3918f)
                curveTo(22.5125f, 20.2919f, 22.2536f, 21.0497f, 21.6517f, 21.6516f)
                curveTo(21.0497f, 22.2536f, 20.2919f, 22.5125f, 19.3918f, 22.6335f)
                curveTo(18.5248f, 22.75f, 17.4225f, 22.75f, 16.0549f, 22.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 22.75f, 5.4752f, 22.75f, 4.6083f, 22.6335f)
                curveTo(3.7081f, 22.5125f, 2.9503f, 22.2536f, 2.3484f, 21.6516f)
                curveTo(1.7464f, 21.0497f, 1.4875f, 20.2919f, 1.3665f, 19.3918f)
                curveTo(1.25f, 18.5248f, 1.25f, 17.4225f, 1.25f, 16.0549f)
                verticalLineTo(15.9451f)
                curveTo(1.25f, 14.5775f, 1.25f, 13.4752f, 1.3665f, 12.6082f)
                curveTo(1.4875f, 11.7081f, 1.7464f, 10.9503f, 2.3484f, 10.3483f)
                curveTo(2.9503f, 9.7464f, 3.7081f, 9.4875f, 4.6083f, 9.3665f)
                curveTo(4.8094f, 9.3395f, 5.0232f, 9.3187f, 5.25f, 9.3028f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(6.75f, 5.1005f, 9.1005f, 2.75f, 12.0f, 2.75f)
                curveTo(14.8995f, 2.75f, 17.25f, 5.1005f, 17.25f, 8.0f)
                verticalLineTo(9.2534f)
                curveTo(16.8765f, 9.25f, 16.4784f, 9.25f, 16.0549f, 9.25f)
                horizontalLineTo(7.9451f)
                curveTo(7.5216f, 9.25f, 7.1235f, 9.25f, 6.75f, 9.2534f)
                verticalLineTo(8.0f)
                close()
                moveTo(4.8081f, 10.8531f)
                curveTo(4.0743f, 10.9518f, 3.6858f, 11.1322f, 3.409f, 11.409f)
                curveTo(3.1323f, 11.6858f, 2.9518f, 12.0743f, 2.8531f, 12.8081f)
                curveTo(2.7516f, 13.5635f, 2.75f, 14.5646f, 2.75f, 16.0f)
                curveTo(2.75f, 17.4354f, 2.7516f, 18.4365f, 2.8531f, 19.1919f)
                curveTo(2.9518f, 19.9257f, 3.1323f, 20.3142f, 3.409f, 20.591f)
                curveTo(3.6858f, 20.8678f, 4.0743f, 21.0482f, 4.8081f, 21.1469f)
                curveTo(5.5635f, 21.2484f, 6.5646f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 21.25f, 18.4365f, 21.2484f, 19.1919f, 21.1469f)
                curveTo(19.9257f, 21.0482f, 20.3142f, 20.8678f, 20.591f, 20.591f)
                curveTo(20.8678f, 20.3142f, 21.0482f, 19.9257f, 21.1469f, 19.1919f)
                curveTo(21.2484f, 18.4365f, 21.25f, 17.4354f, 21.25f, 16.0f)
                curveTo(21.25f, 14.5646f, 21.2484f, 13.5635f, 21.1469f, 12.8081f)
                curveTo(21.0482f, 12.0743f, 20.8678f, 11.6858f, 20.591f, 11.409f)
                curveTo(20.3142f, 11.1322f, 19.9257f, 10.9518f, 19.1919f, 10.8531f)
                curveTo(18.4365f, 10.7516f, 17.4354f, 10.75f, 16.0f, 10.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 10.75f, 5.5635f, 10.7516f, 4.8081f, 10.8531f)
                close()
            }
        }
            .build()
        return _lockKeyholeMinimalistic!!
    }

private var _lockKeyholeMinimalistic: ImageVector? = null
