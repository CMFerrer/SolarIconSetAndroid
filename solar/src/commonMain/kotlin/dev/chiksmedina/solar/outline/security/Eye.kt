package dev.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(
            name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.25f)
                curveTo(9.9289f, 8.25f, 8.25f, 9.9289f, 8.25f, 12.0f)
                curveTo(8.25f, 14.0711f, 9.9289f, 15.75f, 12.0f, 15.75f)
                curveTo(14.0711f, 15.75f, 15.75f, 14.0711f, 15.75f, 12.0f)
                curveTo(15.75f, 9.9289f, 14.0711f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(7.4859f, 3.25f, 4.4453f, 5.9542f, 2.6806f, 8.2469f)
                lineTo(2.6487f, 8.2882f)
                curveTo(2.2496f, 8.8065f, 1.8821f, 9.2839f, 1.6327f, 9.8484f)
                curveTo(1.3656f, 10.4529f, 1.25f, 11.1117f, 1.25f, 12.0f)
                curveTo(1.25f, 12.8883f, 1.3656f, 13.5471f, 1.6327f, 14.1516f)
                curveTo(1.8821f, 14.7161f, 2.2496f, 15.1935f, 2.6488f, 15.7118f)
                lineTo(2.6806f, 15.7531f)
                curveTo(4.4453f, 18.0458f, 7.4859f, 20.75f, 12.0f, 20.75f)
                curveTo(16.5141f, 20.75f, 19.5547f, 18.0458f, 21.3194f, 15.7531f)
                lineTo(21.3512f, 15.7118f)
                curveTo(21.7504f, 15.1935f, 22.1179f, 14.7161f, 22.3673f, 14.1516f)
                curveTo(22.6344f, 13.5471f, 22.75f, 12.8883f, 22.75f, 12.0f)
                curveTo(22.75f, 11.1117f, 22.6344f, 10.4529f, 22.3673f, 9.8484f)
                curveTo(22.1179f, 9.2839f, 21.7504f, 8.8065f, 21.3512f, 8.2882f)
                lineTo(21.3194f, 8.2469f)
                curveTo(19.5547f, 5.9542f, 16.5141f, 3.25f, 12.0f, 3.25f)
                close()
                moveTo(3.8692f, 9.1618f)
                curveTo(5.4986f, 7.0449f, 8.1504f, 4.75f, 12.0f, 4.75f)
                curveTo(15.8496f, 4.75f, 18.5014f, 7.0449f, 20.1308f, 9.1618f)
                curveTo(20.5694f, 9.7316f, 20.8263f, 10.0721f, 20.9952f, 10.4545f)
                curveTo(21.1532f, 10.812f, 21.25f, 11.2489f, 21.25f, 12.0f)
                curveTo(21.25f, 12.7511f, 21.1532f, 13.188f, 20.9952f, 13.5455f)
                curveTo(20.8263f, 13.9279f, 20.5694f, 14.2684f, 20.1308f, 14.8382f)
                curveTo(18.5014f, 16.9551f, 15.8496f, 19.25f, 12.0f, 19.25f)
                curveTo(8.1504f, 19.25f, 5.4986f, 16.9551f, 3.8692f, 14.8382f)
                curveTo(3.4306f, 14.2684f, 3.1737f, 13.9279f, 3.0048f, 13.5455f)
                curveTo(2.8468f, 13.188f, 2.75f, 12.7511f, 2.75f, 12.0f)
                curveTo(2.75f, 11.2489f, 2.8468f, 10.812f, 3.0048f, 10.4545f)
                curveTo(3.1737f, 10.0721f, 3.4306f, 9.7316f, 3.8692f, 9.1618f)
                close()
            }
        }
            .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
