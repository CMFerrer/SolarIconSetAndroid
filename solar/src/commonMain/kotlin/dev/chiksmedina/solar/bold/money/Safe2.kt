package dev.chiksmedina.solar.bold.money

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
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.Safe2: ImageVector
    get() {
        if (_safe2 != null) {
            return _safe2!!
        }
        _safe2 = Builder(
            name = "Safe2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 12.0f)
                curveTo(8.75f, 10.4632f, 9.8167f, 9.1756f, 11.25f, 8.837f)
                verticalLineTo(9.878f)
                curveTo(10.3761f, 10.1869f, 9.75f, 11.0203f, 9.75f, 12.0f)
                curveTo(9.75f, 12.0492f, 9.7516f, 12.0979f, 9.7547f, 12.1463f)
                lineTo(8.7975f, 12.5565f)
                curveTo(8.7663f, 12.3757f, 8.75f, 12.1898f, 8.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 9.878f)
                verticalLineTo(8.837f)
                curveTo(14.1833f, 9.1756f, 15.25f, 10.4632f, 15.25f, 12.0f)
                curveTo(15.25f, 12.1898f, 15.2337f, 12.3757f, 15.2025f, 12.5565f)
                lineTo(14.2453f, 12.1463f)
                curveTo(14.2484f, 12.0979f, 14.25f, 12.0492f, 14.25f, 12.0f)
                curveTo(14.25f, 11.0203f, 13.6239f, 10.1869f, 12.75f, 9.878f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.6544f, 13.525f)
                lineTo(14.6113f, 13.9351f)
                curveTo(14.0191f, 14.733f, 13.0699f, 15.25f, 12.0f, 15.25f)
                curveTo(10.9301f, 15.25f, 9.9809f, 14.733f, 9.3886f, 13.9351f)
                lineTo(10.3456f, 13.525f)
                curveTo(10.7568f, 13.9708f, 11.3458f, 14.25f, 12.0f, 14.25f)
                curveTo(12.6542f, 14.25f, 13.2432f, 13.9708f, 13.6544f, 13.525f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.8081f, 5.8531f)
                curveTo(7.0743f, 5.9518f, 6.6858f, 6.1322f, 6.409f, 6.409f)
                curveTo(6.1322f, 6.6858f, 5.9518f, 7.0743f, 5.8531f, 7.8081f)
                curveTo(5.7516f, 8.5635f, 5.75f, 9.5646f, 5.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(5.75f, 14.4354f, 5.7516f, 15.4365f, 5.8531f, 16.1919f)
                curveTo(5.9518f, 16.9257f, 6.1322f, 17.3142f, 6.409f, 17.591f)
                curveTo(6.6858f, 17.8678f, 7.0743f, 18.0482f, 7.8081f, 18.1469f)
                curveTo(8.5635f, 18.2484f, 9.5646f, 18.25f, 11.0f, 18.25f)
                horizontalLineTo(13.0f)
                curveTo(14.4354f, 18.25f, 15.4365f, 18.2484f, 16.1919f, 18.1469f)
                curveTo(16.9257f, 18.0482f, 17.3142f, 17.8678f, 17.591f, 17.591f)
                curveTo(17.8678f, 17.3142f, 18.0482f, 16.9257f, 18.1469f, 16.1919f)
                curveTo(18.2484f, 15.4365f, 18.25f, 14.4354f, 18.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(18.25f, 9.5646f, 18.2484f, 8.5635f, 18.1469f, 7.8081f)
                curveTo(18.0482f, 7.0743f, 17.8678f, 6.6858f, 17.591f, 6.409f)
                curveTo(17.3142f, 6.1322f, 16.9257f, 5.9518f, 16.1919f, 5.8531f)
                curveTo(15.4365f, 5.7516f, 14.4354f, 5.75f, 13.0f, 5.75f)
                horizontalLineTo(11.0f)
                curveTo(9.5646f, 5.75f, 8.5635f, 5.7516f, 7.8081f, 5.8531f)
                close()
                moveTo(12.0f, 7.25f)
                curveTo(9.3766f, 7.25f, 7.25f, 9.3766f, 7.25f, 12.0f)
                curveTo(7.25f, 14.6234f, 9.3766f, 16.75f, 12.0f, 16.75f)
                curveTo(14.6234f, 16.75f, 16.75f, 14.6234f, 16.75f, 12.0f)
                curveTo(16.75f, 9.3766f, 14.6234f, 7.25f, 12.0f, 7.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(13.0549f, 4.25f)
                curveTo(14.4225f, 4.25f, 15.5248f, 4.25f, 16.3918f, 4.3665f)
                curveTo(17.2919f, 4.4875f, 18.0497f, 4.7464f, 18.6516f, 5.3484f)
                curveTo(19.2536f, 5.9503f, 19.5125f, 6.7081f, 19.6335f, 7.6083f)
                curveTo(19.75f, 8.4752f, 19.75f, 9.5775f, 19.75f, 10.9451f)
                verticalLineTo(13.0549f)
                curveTo(19.75f, 14.4225f, 19.75f, 15.5248f, 19.6335f, 16.3918f)
                curveTo(19.5125f, 17.2919f, 19.2536f, 18.0497f, 18.6516f, 18.6517f)
                curveTo(18.0497f, 19.2536f, 17.2919f, 19.5125f, 16.3918f, 19.6335f)
                curveTo(15.5248f, 19.75f, 14.4225f, 19.75f, 13.0549f, 19.75f)
                horizontalLineTo(10.9451f)
                curveTo(9.5775f, 19.75f, 8.4752f, 19.75f, 7.6083f, 19.6335f)
                curveTo(6.7081f, 19.5125f, 5.9503f, 19.2536f, 5.3484f, 18.6517f)
                curveTo(5.0703f, 18.3736f, 4.8655f, 18.0623f, 4.7136f, 17.7191f)
                curveTo(4.6459f, 17.7392f, 4.5742f, 17.75f, 4.5f, 17.75f)
                curveTo(4.0858f, 17.75f, 3.75f, 17.4142f, 3.75f, 17.0f)
                verticalLineTo(14.0f)
                curveTo(3.75f, 13.6734f, 3.9587f, 13.3956f, 4.25f, 13.2927f)
                verticalLineTo(10.7073f)
                curveTo(3.9587f, 10.6044f, 3.75f, 10.3266f, 3.75f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(3.75f, 6.5858f, 4.0858f, 6.25f, 4.5f, 6.25f)
                curveTo(4.5742f, 6.25f, 4.6459f, 6.2608f, 4.7136f, 6.2809f)
                curveTo(4.8655f, 5.9377f, 5.0703f, 5.6264f, 5.3484f, 5.3484f)
                curveTo(5.9503f, 4.7464f, 6.7081f, 4.4875f, 7.6083f, 4.3665f)
                curveTo(8.4752f, 4.25f, 9.5775f, 4.25f, 10.9451f, 4.25f)
                horizontalLineTo(13.0549f)
                close()
            }
        }
            .build()
        return _safe2!!
    }

private var _safe2: ImageVector? = null
