package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = Builder(
            name = "LinkSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9451f, 5.25f)
                curveTo(6.5775f, 5.25f, 5.4752f, 5.25f, 4.6083f, 5.3665f)
                curveTo(3.7081f, 5.4875f, 2.9503f, 5.7464f, 2.3484f, 6.3484f)
                curveTo(1.7464f, 6.9503f, 1.4875f, 7.7081f, 1.3665f, 8.6082f)
                curveTo(1.25f, 9.4752f, 1.25f, 10.5775f, 1.25f, 11.9451f)
                verticalLineTo(12.0549f)
                curveTo(1.25f, 13.4225f, 1.25f, 14.5248f, 1.3665f, 15.3918f)
                curveTo(1.4875f, 16.2919f, 1.7464f, 17.0497f, 2.3484f, 17.6517f)
                curveTo(2.9503f, 18.2536f, 3.7081f, 18.5125f, 4.6083f, 18.6335f)
                curveTo(5.4752f, 18.75f, 6.5775f, 18.75f, 7.9451f, 18.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 18.75f, 8.75f, 18.4142f, 8.75f, 18.0f)
                curveTo(8.75f, 17.5858f, 8.4142f, 17.25f, 8.0f, 17.25f)
                curveTo(6.5646f, 17.25f, 5.5635f, 17.2484f, 4.8081f, 17.1469f)
                curveTo(4.0743f, 17.0482f, 3.6858f, 16.8678f, 3.409f, 16.591f)
                curveTo(3.1323f, 16.3142f, 2.9518f, 15.9257f, 2.8531f, 15.1919f)
                curveTo(2.7516f, 14.4365f, 2.75f, 13.4354f, 2.75f, 12.0f)
                curveTo(2.75f, 10.5646f, 2.7516f, 9.5635f, 2.8531f, 8.8081f)
                curveTo(2.9518f, 8.0744f, 3.1323f, 7.6858f, 3.409f, 7.409f)
                curveTo(3.6858f, 7.1322f, 4.0743f, 6.9518f, 4.8081f, 6.8531f)
                curveTo(5.5635f, 6.7516f, 6.5646f, 6.75f, 8.0f, 6.75f)
                curveTo(9.4354f, 6.75f, 10.4365f, 6.7516f, 11.1919f, 6.8531f)
                curveTo(11.9257f, 6.9518f, 12.3142f, 7.1322f, 12.591f, 7.409f)
                curveTo(12.8678f, 7.6858f, 13.0482f, 8.0744f, 13.1469f, 8.8081f)
                curveTo(13.2484f, 9.5635f, 13.25f, 10.5646f, 13.25f, 12.0f)
                curveTo(13.25f, 12.4142f, 13.5858f, 12.75f, 14.0f, 12.75f)
                curveTo(14.4142f, 12.75f, 14.75f, 12.4142f, 14.75f, 12.0f)
                verticalLineTo(11.9451f)
                curveTo(14.75f, 10.5775f, 14.75f, 9.4752f, 14.6335f, 8.6082f)
                curveTo(14.5125f, 7.7081f, 14.2536f, 6.9503f, 13.6517f, 6.3484f)
                curveTo(13.0497f, 5.7464f, 12.2919f, 5.4875f, 11.3918f, 5.3665f)
                curveTo(10.5248f, 5.25f, 9.4225f, 5.25f, 8.0549f, 5.25f)
                horizontalLineTo(7.9451f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.75f)
                curveTo(17.4354f, 6.75f, 18.4365f, 6.7516f, 19.1919f, 6.8531f)
                curveTo(19.9257f, 6.9518f, 20.3142f, 7.1322f, 20.591f, 7.409f)
                curveTo(20.8678f, 7.6858f, 21.0482f, 8.0744f, 21.1469f, 8.8081f)
                curveTo(21.2484f, 9.5635f, 21.25f, 10.5646f, 21.25f, 12.0f)
                curveTo(21.25f, 13.4354f, 21.2484f, 14.4365f, 21.1469f, 15.1919f)
                curveTo(21.0482f, 15.9257f, 20.8678f, 16.3142f, 20.591f, 16.591f)
                curveTo(20.3142f, 16.8678f, 19.9257f, 17.0482f, 19.1919f, 17.1469f)
                curveTo(18.4365f, 17.2484f, 17.4354f, 17.25f, 16.0f, 17.25f)
                curveTo(14.5646f, 17.25f, 13.5635f, 17.2484f, 12.8081f, 17.1469f)
                curveTo(12.0743f, 17.0482f, 11.6858f, 16.8678f, 11.409f, 16.591f)
                curveTo(11.1322f, 16.3142f, 10.9518f, 15.9257f, 10.8531f, 15.1919f)
                curveTo(10.7516f, 14.4365f, 10.75f, 13.4354f, 10.75f, 12.0f)
                curveTo(10.75f, 11.5858f, 10.4142f, 11.25f, 10.0f, 11.25f)
                curveTo(9.5858f, 11.25f, 9.25f, 11.5858f, 9.25f, 12.0f)
                lineTo(9.25f, 12.0549f)
                curveTo(9.25f, 13.4225f, 9.25f, 14.5248f, 9.3665f, 15.3918f)
                curveTo(9.4875f, 16.2919f, 9.7464f, 17.0497f, 10.3484f, 17.6517f)
                curveTo(10.9503f, 18.2536f, 11.7081f, 18.5125f, 12.6083f, 18.6335f)
                curveTo(13.4752f, 18.75f, 14.5775f, 18.75f, 15.9451f, 18.75f)
                horizontalLineTo(16.0549f)
                curveTo(17.4225f, 18.75f, 18.5248f, 18.75f, 19.3918f, 18.6335f)
                curveTo(20.2919f, 18.5125f, 21.0497f, 18.2536f, 21.6517f, 17.6517f)
                curveTo(22.2536f, 17.0497f, 22.5125f, 16.2919f, 22.6335f, 15.3918f)
                curveTo(22.75f, 14.5248f, 22.75f, 13.4225f, 22.75f, 12.0549f)
                verticalLineTo(11.9451f)
                curveTo(22.75f, 10.5775f, 22.75f, 9.4752f, 22.6335f, 8.6082f)
                curveTo(22.5125f, 7.7081f, 22.2536f, 6.9503f, 21.6517f, 6.3484f)
                curveTo(21.0497f, 5.7464f, 20.2919f, 5.4875f, 19.3918f, 5.3665f)
                curveTo(18.5248f, 5.25f, 17.4225f, 5.25f, 16.0549f, 5.25f)
                horizontalLineTo(16.0f)
                curveTo(15.5858f, 5.25f, 15.25f, 5.5858f, 15.25f, 6.0f)
                curveTo(15.25f, 6.4142f, 15.5858f, 6.75f, 16.0f, 6.75f)
                close()
            }
        }
            .build()
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
