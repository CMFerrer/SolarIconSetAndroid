package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

public val NotesGroup.Documents: ImageVector
    get() {
        if (_documents != null) {
            return _documents!!
        }
        _documents = Builder(name = "Documents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9451f, 1.25f)
                horizontalLineTo(13.0549f)
                curveTo(14.4225f, 1.25f, 15.5248f, 1.25f, 16.3918f, 1.3665f)
                curveTo(17.2919f, 1.4875f, 18.0497f, 1.7464f, 18.6517f, 2.3484f)
                curveTo(18.9501f, 2.6468f, 19.1642f, 2.9836f, 19.319f, 3.3571f)
                curveTo(20.2511f, 3.4739f, 21.0336f, 3.7303f, 21.6517f, 4.3484f)
                curveTo(22.2536f, 4.9503f, 22.5125f, 5.7082f, 22.6335f, 6.6083f)
                curveTo(22.75f, 7.4753f, 22.75f, 8.5776f, 22.75f, 9.9452f)
                verticalLineTo(14.0549f)
                curveTo(22.75f, 15.4225f, 22.75f, 16.5248f, 22.6335f, 17.3918f)
                curveTo(22.5125f, 18.2919f, 22.2536f, 19.0498f, 21.6517f, 19.6517f)
                curveTo(21.0336f, 20.2698f, 20.2511f, 20.5262f, 19.319f, 20.643f)
                curveTo(19.1642f, 21.0164f, 18.9501f, 21.3532f, 18.6517f, 21.6517f)
                curveTo(18.0497f, 22.2536f, 17.2919f, 22.5125f, 16.3918f, 22.6335f)
                curveTo(15.5248f, 22.75f, 14.4225f, 22.75f, 13.0549f, 22.75f)
                horizontalLineTo(10.9451f)
                curveTo(9.5775f, 22.75f, 8.4752f, 22.75f, 7.6083f, 22.6335f)
                curveTo(6.7081f, 22.5125f, 5.9503f, 22.2536f, 5.3484f, 21.6517f)
                curveTo(5.0499f, 21.3532f, 4.8358f, 21.0164f, 4.681f, 20.643f)
                curveTo(3.7489f, 20.5262f, 2.9664f, 20.2698f, 2.3484f, 19.6517f)
                curveTo(1.7464f, 19.0498f, 1.4875f, 18.2919f, 1.3665f, 17.3918f)
                curveTo(1.25f, 16.5248f, 1.25f, 15.4225f, 1.25f, 14.0549f)
                verticalLineTo(9.9452f)
                curveTo(1.25f, 8.5776f, 1.25f, 7.4753f, 1.3665f, 6.6083f)
                curveTo(1.4875f, 5.7082f, 1.7464f, 4.9503f, 2.3484f, 4.3484f)
                curveTo(2.9664f, 3.7303f, 3.7489f, 3.4739f, 4.681f, 3.3571f)
                curveTo(4.8358f, 2.9836f, 5.0499f, 2.6468f, 5.3484f, 2.3484f)
                curveTo(5.9503f, 1.7464f, 6.7081f, 1.4875f, 7.6083f, 1.3665f)
                curveTo(8.4752f, 1.25f, 9.5775f, 1.25f, 10.9451f, 1.25f)
                close()
                moveTo(4.3284f, 4.9405f)
                curveTo(3.8908f, 5.0459f, 3.618f, 5.2001f, 3.409f, 5.4091f)
                curveTo(3.1323f, 5.6858f, 2.9518f, 6.0744f, 2.8531f, 6.8082f)
                curveTo(2.7516f, 7.5635f, 2.75f, 8.5646f, 2.75f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(2.75f, 15.4355f, 2.7516f, 16.4366f, 2.8531f, 17.1919f)
                curveTo(2.9518f, 17.9257f, 3.1323f, 18.3143f, 3.409f, 18.591f)
                curveTo(3.618f, 18.8f, 3.8908f, 18.9542f, 4.3285f, 19.0596f)
                curveTo(4.25f, 18.2484f, 4.25f, 17.2535f, 4.25f, 16.0549f)
                verticalLineTo(7.9451f)
                curveTo(4.25f, 6.7465f, 4.25f, 5.7517f, 4.3284f, 4.9405f)
                close()
                moveTo(19.6716f, 19.0596f)
                curveTo(20.1092f, 18.9542f, 20.382f, 18.8f, 20.591f, 18.591f)
                curveTo(20.8678f, 18.3143f, 21.0482f, 17.9257f, 21.1469f, 17.1919f)
                curveTo(21.2484f, 16.4366f, 21.25f, 15.4355f, 21.25f, 14.0001f)
                verticalLineTo(10.0001f)
                curveTo(21.25f, 8.5646f, 21.2484f, 7.5635f, 21.1469f, 6.8082f)
                curveTo(21.0482f, 6.0744f, 20.8678f, 5.6858f, 20.591f, 5.4091f)
                curveTo(20.382f, 5.2001f, 20.1092f, 5.0459f, 19.6716f, 4.9405f)
                curveTo(19.75f, 5.7517f, 19.75f, 6.7465f, 19.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(19.75f, 17.2535f, 19.75f, 18.2484f, 19.6716f, 19.0596f)
                close()
                moveTo(7.8081f, 2.8531f)
                curveTo(7.0743f, 2.9518f, 6.6858f, 3.1323f, 6.409f, 3.409f)
                curveTo(6.1322f, 3.6858f, 5.9518f, 4.0743f, 5.8531f, 4.8081f)
                curveTo(5.7516f, 5.5635f, 5.75f, 6.5646f, 5.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.75f, 17.4354f, 5.7516f, 18.4365f, 5.8531f, 19.1919f)
                curveTo(5.9518f, 19.9257f, 6.1322f, 20.3142f, 6.409f, 20.591f)
                curveTo(6.6858f, 20.8678f, 7.0743f, 21.0482f, 7.8081f, 21.1469f)
                curveTo(8.5635f, 21.2484f, 9.5646f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.4354f, 21.25f, 15.4365f, 21.2484f, 16.1919f, 21.1469f)
                curveTo(16.9257f, 21.0482f, 17.3142f, 20.8678f, 17.591f, 20.591f)
                curveTo(17.8678f, 20.3142f, 18.0482f, 19.9257f, 18.1469f, 19.1919f)
                curveTo(18.2484f, 18.4365f, 18.25f, 17.4354f, 18.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 6.5646f, 18.2484f, 5.5635f, 18.1469f, 4.8081f)
                curveTo(18.0482f, 4.0743f, 17.8678f, 3.6858f, 17.591f, 3.409f)
                curveTo(17.3142f, 3.1323f, 16.9257f, 2.9518f, 16.1919f, 2.8531f)
                curveTo(15.4365f, 2.7516f, 14.4354f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.5646f, 2.75f, 8.5635f, 2.7516f, 7.8081f, 2.8531f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 8.5858f, 8.5858f, 8.25f, 9.0f, 8.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 8.25f, 15.75f, 8.5858f, 15.75f, 9.0f)
                curveTo(15.75f, 9.4142f, 15.4142f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 9.75f, 8.25f, 9.4142f, 8.25f, 9.0f)
                close()
                moveTo(8.25f, 13.0f)
                curveTo(8.25f, 12.5858f, 8.5858f, 12.25f, 9.0f, 12.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 12.25f, 15.75f, 12.5858f, 15.75f, 13.0f)
                curveTo(15.75f, 13.4142f, 15.4142f, 13.75f, 15.0f, 13.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                close()
                moveTo(8.25f, 17.0f)
                curveTo(8.25f, 16.5858f, 8.5858f, 16.25f, 9.0f, 16.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 16.25f, 12.75f, 16.5858f, 12.75f, 17.0f)
                curveTo(12.75f, 17.4142f, 12.4142f, 17.75f, 12.0f, 17.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 17.75f, 8.25f, 17.4142f, 8.25f, 17.0f)
                close()
            }
        }
        .build()
        return _documents!!
    }

private var _documents: ImageVector? = null
