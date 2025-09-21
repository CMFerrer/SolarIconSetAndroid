package dev.chiksmedina.solar.boldduotone.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.NotificationsGroup

val NotificationsGroup.BellOff: ImageVector
    get() {
        if (_bellOff != null) {
            return _bellOff!!
        }
        _bellOff = Builder(
            name = "BellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.7491f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(18.7491f, 10.5491f, 18.9903f, 11.3752f, 19.4422f, 12.0782f)
                lineTo(20.5496f, 13.8012f)
                curveTo(21.5612f, 15.3749f, 20.789f, 17.5139f, 19.0296f, 18.0116f)
                curveTo(14.4273f, 19.3134f, 9.5727f, 19.3134f, 4.9704f, 18.0116f)
                curveTo(3.2111f, 17.5139f, 2.4388f, 15.3749f, 3.4504f, 13.8012f)
                lineTo(4.5578f, 12.0782f)
                curveTo(5.0097f, 11.3752f, 5.2509f, 10.5491f, 5.2509f, 9.7041f)
                verticalLineTo(9.0f)
                curveTo(5.2509f, 5.134f, 8.2726f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7274f, 2.0f, 18.7491f, 5.134f, 18.7491f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.2432f, 18.5449f)
                curveTo(7.8941f, 20.5501f, 9.7777f, 21.9997f, 11.9998f, 21.9997f)
                curveTo(14.222f, 21.9997f, 16.1055f, 20.5501f, 16.7565f, 18.5449f)
                curveTo(13.611f, 19.1352f, 10.3886f, 19.1352f, 7.2432f, 18.5449f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.3486f, 9.0f)
                curveTo(9.3486f, 9.4142f, 9.6724f, 9.75f, 10.0718f, 9.75f)
                horizontalLineTo(12.1827f)
                lineTo(9.5604f, 12.4697f)
                curveTo(9.3536f, 12.6842f, 9.2918f, 13.0068f, 9.4037f, 13.287f)
                curveTo(9.5156f, 13.5673f, 9.7793f, 13.75f, 10.0718f, 13.75f)
                horizontalLineTo(13.9284f)
                curveTo(14.3278f, 13.75f, 14.6515f, 13.4142f, 14.6515f, 13.0f)
                curveTo(14.6515f, 12.5858f, 14.3278f, 12.25f, 13.9284f, 12.25f)
                horizontalLineTo(11.8175f)
                lineTo(14.4397f, 9.5303f)
                curveTo(14.6466f, 9.3158f, 14.7084f, 8.9932f, 14.5965f, 8.713f)
                curveTo(14.4846f, 8.4327f, 14.2209f, 8.25f, 13.9284f, 8.25f)
                horizontalLineTo(10.0718f)
                curveTo(9.6724f, 8.25f, 9.3486f, 8.5858f, 9.3486f, 9.0f)
                close()
            }
        }
            .build()
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
