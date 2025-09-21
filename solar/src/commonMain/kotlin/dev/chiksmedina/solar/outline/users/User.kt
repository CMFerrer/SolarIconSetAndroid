package dev.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.UsersGroup

val UsersGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(
            name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(9.3767f, 1.25f, 7.25f, 3.3767f, 7.25f, 6.0f)
                curveTo(7.25f, 8.6234f, 9.3767f, 10.75f, 12.0f, 10.75f)
                curveTo(14.6234f, 10.75f, 16.75f, 8.6234f, 16.75f, 6.0f)
                curveTo(16.75f, 3.3767f, 14.6234f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.75f, 6.0f)
                curveTo(8.75f, 4.2051f, 10.2051f, 2.75f, 12.0f, 2.75f)
                curveTo(13.7949f, 2.75f, 15.25f, 4.2051f, 15.25f, 6.0f)
                curveTo(15.25f, 7.7949f, 13.7949f, 9.25f, 12.0f, 9.25f)
                curveTo(10.2051f, 9.25f, 8.75f, 7.7949f, 8.75f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 12.25f)
                curveTo(9.6865f, 12.25f, 7.5549f, 12.7759f, 5.9755f, 13.6643f)
                curveTo(4.4195f, 14.5396f, 3.25f, 15.8661f, 3.25f, 17.5f)
                lineTo(3.2499f, 17.602f)
                curveTo(3.2488f, 18.7638f, 3.2474f, 20.222f, 4.5264f, 21.2635f)
                curveTo(5.1559f, 21.7761f, 6.0365f, 22.1406f, 7.2262f, 22.3815f)
                curveTo(8.4193f, 22.6229f, 9.9742f, 22.75f, 12.0f, 22.75f)
                curveTo(14.0258f, 22.75f, 15.5808f, 22.6229f, 16.7738f, 22.3815f)
                curveTo(17.9635f, 22.1406f, 18.8441f, 21.7761f, 19.4736f, 21.2635f)
                curveTo(20.7526f, 20.222f, 20.7512f, 18.7638f, 20.7501f, 17.602f)
                lineTo(20.75f, 17.5f)
                curveTo(20.75f, 15.8661f, 19.5805f, 14.5396f, 18.0246f, 13.6643f)
                curveTo(16.4451f, 12.7759f, 14.3136f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(4.75f, 17.5f)
                curveTo(4.75f, 16.6487f, 5.3714f, 15.7251f, 6.7108f, 14.9717f)
                curveTo(8.0268f, 14.2315f, 9.8953f, 13.75f, 12.0f, 13.75f)
                curveTo(14.1047f, 13.75f, 15.9732f, 14.2315f, 17.2892f, 14.9717f)
                curveTo(18.6286f, 15.7251f, 19.25f, 16.6487f, 19.25f, 17.5f)
                curveTo(19.25f, 18.8078f, 19.2097f, 19.544f, 18.5264f, 20.1004f)
                curveTo(18.1559f, 20.4022f, 17.5365f, 20.6967f, 16.4762f, 20.9113f)
                curveTo(15.4193f, 21.1252f, 13.9742f, 21.25f, 12.0f, 21.25f)
                curveTo(10.0258f, 21.25f, 8.5808f, 21.1252f, 7.5238f, 20.9113f)
                curveTo(6.4635f, 20.6967f, 5.8441f, 20.4022f, 5.4736f, 20.1004f)
                curveTo(4.7903f, 19.544f, 4.75f, 18.8078f, 4.75f, 17.5f)
                close()
            }
        }
            .build()
        return _user!!
    }

private var _user: ImageVector? = null
