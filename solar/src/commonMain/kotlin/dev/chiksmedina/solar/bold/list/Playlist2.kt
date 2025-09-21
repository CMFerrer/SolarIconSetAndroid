package dev.chiksmedina.solar.bold.list

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
import dev.chiksmedina.solar.bold.ListGroup

val ListGroup.Playlist2: ImageVector
    get() {
        if (_playlist2 != null) {
            return _playlist2!!
        }
        _playlist2 = Builder(
            name = "Playlist2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.3446f, 5.9929f)
                curveTo(19.6232f, 5.8902f, 19.9559f, 5.8021f, 20.3149f, 5.8678f)
                curveTo(20.7572f, 5.9487f, 21.1513f, 6.1967f, 21.4156f, 6.5604f)
                curveTo(21.6302f, 6.8557f, 21.6948f, 7.1937f, 21.7228f, 7.4893f)
                curveTo(21.75f, 7.777f, 21.75f, 8.1358f, 21.75f, 8.5446f)
                lineTo(21.75f, 8.5789f)
                lineTo(21.7501f, 8.6545f)
                curveTo(21.7509f, 8.9546f, 21.7518f, 9.2752f, 21.644f, 9.5704f)
                curveTo(21.559f, 9.8035f, 21.4254f, 10.0159f, 21.252f, 10.1934f)
                curveTo(21.0324f, 10.4183f, 20.7431f, 10.5562f, 20.4722f, 10.6854f)
                lineTo(20.404f, 10.718f)
                lineTo(18.6185f, 11.575f)
                curveTo(18.25f, 11.752f, 17.9266f, 11.9072f, 17.6554f, 12.0071f)
                curveTo(17.3936f, 12.1036f, 17.0842f, 12.1872f, 16.75f, 12.1425f)
                verticalLineTo(16.4286f)
                curveTo(16.75f, 18.2429f, 15.3147f, 19.75f, 13.5f, 19.75f)
                curveTo(11.6853f, 19.75f, 10.25f, 18.2429f, 10.25f, 16.4286f)
                curveTo(10.25f, 14.6143f, 11.6853f, 13.1071f, 13.5f, 13.1071f)
                curveTo(14.1477f, 13.1071f, 14.747f, 13.2991f, 15.25f, 13.6285f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.2529f)
                curveTo(15.25f, 9.8312f, 15.25f, 9.6489f, 15.25f, 9.4554f)
                lineTo(15.25f, 9.4211f)
                lineTo(15.2499f, 9.3455f)
                curveTo(15.2491f, 9.0454f, 15.2482f, 8.7248f, 15.356f, 8.4296f)
                curveTo(15.441f, 8.1965f, 15.5746f, 7.9841f, 15.748f, 7.8066f)
                curveTo(15.9676f, 7.5817f, 16.2569f, 7.4438f, 16.5278f, 7.3146f)
                lineTo(16.596f, 7.282f)
                lineTo(18.3814f, 6.425f)
                curveTo(18.75f, 6.2481f, 19.0734f, 6.0928f, 19.3446f, 5.9929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 5.0f)
                curveTo(2.25f, 4.5858f, 2.5858f, 4.25f, 3.0f, 4.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 4.25f, 15.75f, 4.5858f, 15.75f, 5.0f)
                curveTo(15.75f, 5.4142f, 15.4142f, 5.75f, 15.0f, 5.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 5.75f, 2.25f, 5.4142f, 2.25f, 5.0f)
                close()
                moveTo(2.25f, 9.0f)
                curveTo(2.25f, 8.5858f, 2.5858f, 8.25f, 3.0f, 8.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.25f, 13.75f, 8.5858f, 13.75f, 9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 9.75f, 2.25f, 9.4142f, 2.25f, 9.0f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 12.5858f, 2.5858f, 12.25f, 3.0f, 12.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 12.25f, 9.75f, 12.5858f, 9.75f, 13.0f)
                curveTo(9.75f, 13.4142f, 9.4142f, 13.75f, 9.0f, 13.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 13.75f, 2.25f, 13.4142f, 2.25f, 13.0f)
                close()
                moveTo(2.25f, 17.0f)
                curveTo(2.25f, 16.5858f, 2.5858f, 16.25f, 3.0f, 16.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 16.25f, 8.75f, 16.5858f, 8.75f, 17.0f)
                curveTo(8.75f, 17.4142f, 8.4142f, 17.75f, 8.0f, 17.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 17.75f, 2.25f, 17.4142f, 2.25f, 17.0f)
                close()
            }
        }
            .build()
        return _playlist2!!
    }

private var _playlist2: ImageVector? = null
